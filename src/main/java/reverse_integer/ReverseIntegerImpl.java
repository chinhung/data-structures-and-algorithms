package reverse_integer;

public class ReverseIntegerImpl implements ReverseInteger {

    @Override
    public int reverse(int input) {
        if (-10 < input && 10 > input) {
            return input;
        }

        int sign = input > 0 ? 1 : -1;
        String str = String.valueOf(Math.abs(input));
        String reversedStr = reverseString(str);
        while (reversedStr.startsWith("0")) {
            reversedStr = reversedStr.substring(1);
        }
        return sign * Integer.parseInt(reversedStr);
    }

    private String reverseString(String str) {
        String[] chars = str.split("");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            builder.append(chars[str.length() - 1 - i]);
        }
        return builder.toString();
    }
}
