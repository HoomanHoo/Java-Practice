package lambda;

public class TestStringConcat {

  public static void main(String[] args) {
    // 객체 지향 방식으로 인터페이스를 구현한 뒤 구현 클래스를 객체 생성해서 메서드 호출
    StringConcatImpl sImpl = new StringConcatImpl();
    sImpl.makeString("hello", "java");

    // 함수형 프로그래밍 방식으로 람다식을 사용해서 메서드 호출
    StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2);
    concat.makeString("hello", "lambda");

    // 익명 함수를 이용해서 인터페이스 구현 뒤 메서드 호출
    StringConcat concat2 = new StringConcat(){
      @Override
      public void makeString(String s1, String s2) {
        System.out.println(s1 + " " + s2);
      }
    };
    concat2.makeString("hello", "anonymous");
  }
}
