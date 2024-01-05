package lambda;

// 람다식을 위한 함수형 인터페이스를 선언하고 인터페이스를 타입으로 하는 람다식을 사용할 수 있음
// 함수형 인터페이스는 단 하나의 메서드만을 가질 수 있음 -> 두개 이상의 메서드를 가질 시 구현부가 어느 메서드에 속하는지 모호해지기 때문
@FunctionalInterface  // 두개 이상의 메서드 선언을 막기 위해 @FunctionalInterface 를 붙임 -> 두개 이상의 메서드 선언 시 컴파일 에러를 발생시켜줌
public interface MyNumber {
  int getMaxNumber(int num1, int num2);
//  int testNumber();
}
