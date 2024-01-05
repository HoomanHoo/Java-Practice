package lambda;

public class TestMyNumber {

  public static void main(String[] args) {
    // x, y중 x가 y보다 크거나 같으면 x를 반환, 아니면 y를 반환한다
    // 람다식은 최대한 생략할 수 있는 요소를 생략하여 구현함
    // 함수형 인터페이스의 메서드를 구현한 뒤 사용한다
    int i = 100;
    MyNumber maxNum = (x, y) -> (x >= y) ? x: y;
    int max = maxNum.getMaxNumber(10, 20);
    System.out.println(max);

    /*
    람다식으로 함수형 인터페이스를 구현한 경우 내부에서 다음과 같은 익명 객체가 생성됨
      MyNumber maxNum = new MyNumber() {
        @Override
        public int getMaxNumber(int num1, int num2) {
          return (num1 >= num2) ? num1: num2;
        }
      };
      이 때 익명 객체는 i를 값을 호출할 수는 있지만 변환은 할 수 없는 final 상태의 상수로 취급한다
     */

  }

}
