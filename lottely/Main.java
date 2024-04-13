package lottely;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

  /**
   * ロト6用番号.
   *
   * @param args String[]
   */
  public static void main(String[] args) {
    List<Integer> integerList = IntStream.rangeClosed(1, 43)
        .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

    for (int i = 0; i < 2; i++) {
      Collections.shuffle(integerList);

      integerList.stream()
          .limit(6)
          .collect(Collectors.toList())
          .stream().sorted()
          .forEach(e -> System.out.print(e + " "));

      System.out.println();
    }
  }
}
