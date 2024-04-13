import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    Stream<List<String>> sorted = Stream.of(
            Arrays.asList("a", "b", "a"),
            Arrays.asList("b", "c"),
            Arrays.asList("a", "a", "b")
        )
        .sorted((a, b) -> (
            Comparator.comparing(
                    (Function<List<String>, String> & Serializable) e -> e.get(0))
                .thenComparing(e -> e.get(1))
                .compare(a, b)));

    sorted.forEach(e -> System.out.println(e.get(0) + e.get(1)));
  }
}
