package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
  // Stream 생성
    IntStream stream = Arrays.stream(arr);

    System.out.println(stream.sum());
    // 사용한 스트림 재사용
    //System.out.println(stream.count());
    // Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
    //	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:229)
    // 한 번 사용한 스트림은 재사용 불가
  }
}
