package reverse_string;

import stack.ArrayListBasedStack;
import stack.Stack;

public class StackBasedReverseString implements ReverseString {

    @Override
    public String reverse(String input) {
        Stack<Character> stack = new ArrayListBasedStack<>();
        char[] chars = input.toCharArray();
        for (char c : chars) {
            stack.add(c);
        }

        StringBuilder builder = new StringBuilder();
        while (stack.getSize() != 0) {
            builder.append(stack.remove());
        }

        return builder.toString();
    }
}
