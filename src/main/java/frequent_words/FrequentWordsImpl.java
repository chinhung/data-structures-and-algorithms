package frequent_words;

import java.util.*;
import java.util.stream.Collectors;

public class FrequentWordsImpl implements FrequentWords {

    @Override
    public String[] execute(String[] words, int k) {
        Set<WordCount> wordCountSet = new HashSet<>();
        Map<String, Integer> counterMap = new HashMap<>();

        for (String word : words) {
            Integer counter = counterMap.get(word);
            if (counter == null) {
                counterMap.put(word, 1);
                wordCountSet.add(new WordCount(word, 1));
            } else {
                counterMap.put(word, counter + 1);
                wordCountSet.remove(new WordCount(word, counter));
                wordCountSet.add(new WordCount(word, counter + 1));
            }
        }

        List<WordCount> sorted = wordCountSet.stream().sorted((wordCount1, wordCount2) -> {
            if (wordCount1.getCount() > wordCount2.getCount()) {
                return -1;
            }
            if (wordCount1.getCount() < wordCount2.getCount()) {
                return 1;
            }
            return wordCount1.getWord().compareTo(wordCount2.getWord());
        }).collect(Collectors.toList());

        return sorted.subList(0, k).stream().map(WordCount::getWord).collect(Collectors.toList()).toArray(new String[0]);
    }
}
