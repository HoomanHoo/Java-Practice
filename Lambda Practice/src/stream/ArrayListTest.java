package stream;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

  public static void main(String[] args) {
    List<String> sList = new ArrayList<>();
    sList.add("tom");
    sList.add("john");
    sList.add("paul");

    // 생성한 스트림을 바로 forEach() 메서드로 println() 메서드 순환 실행 
    sList.stream().forEach(System.out::println);
    // 컬렉션 객체에서 바로 forEach() 메서드를 사용할 수 있음
//    sList.forEach(System.out::println);
    System.out.println("=====================");
    // 정렬
    sList.stream().sorted().forEach(str -> System.out.println(str));

    System.out.println("=====================");
    
    // reduce() 메서드를 이용한 사용자 정의 연산
    String result = sList.stream().reduce("reduce ", (a, b) -> a + b);
    System.out.println(result);
  }
}
