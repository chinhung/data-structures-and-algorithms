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

        List<WordCount> sorted = wordCountSet.stream().sorted().collect(Collectors.toList());

        return sorted.subList(0, k).stream().map(WordCount::getWord).toArray(String[]::new);
    }
}
