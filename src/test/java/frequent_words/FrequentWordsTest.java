package frequent_words;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FrequentWordsTest {

    @Test
    public void testFrequentWords() {
        FrequentWords frequentWords = new FrequentWordsImpl();

        assertArrayEquals(new String[]{ "Hi", "There" }, frequentWords.execute(new String[]{ "Hi", "There", "Hi", "There", "Hello" }, 2));
    }
}
