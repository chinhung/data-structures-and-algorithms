package palindrome;

public class PalindromeImpl implements Palindrome {

    @Override
    public boolean execute(String word) {
        String reversed = reverse(word);
        return word.equals(reversed);
    }

    private String reverse(String word) {
        char[] chars = word.toCharArray();
        char[] result = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            result[chars.length - 1 - i] = chars[i];
        }
        return String.valueOf(result);
    }
}
