package frequent_words;

import java.util.Objects;

class WordCount implements Comparable<WordCount> {

    private String word;
    private Integer count;

    public WordCount(String word, Integer count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordCount wordCount = (WordCount) o;
        return word.equals(wordCount.word) && count.equals(wordCount.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, count);
    }

    @Override
    public int compareTo(WordCount o) {
        if (!count.equals(o.getCount())) {
            return (-1) * count.compareTo(o.getCount());
        }
        return word.compareTo(o.getWord());
    }
}
