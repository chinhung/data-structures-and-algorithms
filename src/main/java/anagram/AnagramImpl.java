package anagram;

import java.util.Arrays;
import java.util.Optional;

public class AnagramImpl implements Anagram {

    @Override
    public boolean isAnagram(String sentence1, String sentence2) {
        Optional<String> result1 = cleanAndSort(sentence1);
        Optional<String> result2 = cleanAndSort(sentence2);

        if (!result1.isPresent() || !result2.isPresent()) {
            return false;
        }

        return result1.get().equals(result2.get());
    }

    private Optional<String> cleanAndSort(String str) {
        return Arrays.stream(str.split(""))
                .filter(c -> c.matches("\\w"))
                .map(String::toLowerCase)
                .sorted()
                .reduce((a, b) -> a + b);
    }
}
