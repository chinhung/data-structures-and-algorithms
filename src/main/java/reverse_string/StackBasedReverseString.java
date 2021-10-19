package reverse_string;

import stack.Stack;

public class StackBasedReverseString implements ReverseString {

    private Stack<Character> stack;

    public StackBasedReverseString(Stack<Character> stack) {
        this.stack = stack;
    }

    @Override
    public String reverse(String input) {
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
