package anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnagramTest {

    @Test
    public void testAnagram() {
        Anagram anagram = null;

        assertFalse(anagram.isAnagram("", ""));
        assertFalse(anagram.isAnagram("Hi, there!", "Hello World!"));
        assertTrue(anagram.isAnagram("Madonna Louise Ciccone", "One cool dance musician"));
        assertTrue(anagram.isAnagram("Oh, lame saint", "The Mona Lisa"));
    }
}
