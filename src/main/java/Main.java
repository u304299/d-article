import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.apache.commons.io.input.AutoCloseInputStream;
import org.apache.commons.io.input.AutoCloseInputStream.Builder;
import org.springframework.util.function.ThrowingFunction;

public class Main {

  public static void main(String[] args) throws IOException {

    int read1 = new DataInputStream(
        new FileInputStream("/Users/13r4123/IdeaProjects/d-article/src/main/resources/test.txt"))
        .read();

    int read = new AutoCloseInputStream(new BufferedInputStream(
        new FileInputStream("/Users/13r4123/IdeaProjects/d-article/src/main/resources/test.txt")))
        .read();

    System.out.println(read);


  }

  public static String test(String c) throws Exception {
    if (c == "a") {
      throw new Exception();
    }

    return c;
  }


}
