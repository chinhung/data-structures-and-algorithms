package capitalize;

public class CapitalizeImpl implements Capitalize {

    @Override
    public String execute(String sentence) {
        if ("".equals(sentence)) {
            return "";
        }

        String[] words = sentence.split(" ");

        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            builder.append(word.substring(0, 1).toUpperCase())
                    .append(word.substring(1))
                    .append(" ");
        }

        return builder.toString().trim();
    }
}
