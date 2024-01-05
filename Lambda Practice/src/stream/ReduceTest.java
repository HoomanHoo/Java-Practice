package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{
  //apply 메서드를 구현해줘야함
  @Override
  public String apply(String s1, String s2) {
    if(s1.getBytes().length <= s2.getBytes().length){
      return s1;
    }
    else{
      return s2;
    }
  }
}

public class ReduceTest {

  public static void main(String[] args) {
    String[] greetings = {"안녕하세요", "hello", "こんにちは!!!!!!", "Good Morning", "반갑습니다"};
    // BinaryOperator 대신 직접 람다식을 작성한 경우
    System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
          if(s1.getBytes().length >= s2.getBytes().length){
            return s1;
          }
          else{
            return s2;
          }
        }
      )
    );
    System.out.println("=======================================");
    // BinaryOperator 인터페이스를 구현한 구현체를 매개변수로 넣은 경우
    System.out.println(Arrays.stream(greetings).reduce("", new CompareString()));
    System.out.println("=======================================");
    // 초기값을 넣지 않을 경우 자동으로 리턴 되지 않기 때문에 get() 메서드를 통해 값을 리턴 받아야함
    String result = Arrays.stream(greetings).reduce(new CompareString()).get();
    System.out.println(result);
  }
}
