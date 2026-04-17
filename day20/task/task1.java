import java.util.*;

public class task1 {
    public static void main(String[] args) {
        var words = new ArrayList<String>(Arrays.asList("cake", "banana", "muskmelon", "watermelon"));
        Collections.sort(words, (a, b) -> b.compareTo(a));

        words.forEach(System.out::println);
    }
}
