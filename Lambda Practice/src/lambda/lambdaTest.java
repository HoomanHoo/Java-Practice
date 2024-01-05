package lambda;

interface PrintString{
  void showString(String str);
}

public class lambdaTest {

  public static void main(String[] args) {

    // 특정 자료형으로 변수 선언 후 람다식을 대입해서 사용하기
    PrintString printString = str -> System.out.println(str);
    printString.showString("String");

    // 람다식을 매개변수로 전달해서 사용하기
    showMyString(printString);

    // 메서드의 반환 값으로 람다식 반환하기
    returnPrint().showString("returnPrint");

  }

  public static void showMyString(PrintString printString){
    printString.showString("show my string");
  }

  public static PrintString returnPrint(){
    return str -> System.out.println(str + " return");
  }
}
