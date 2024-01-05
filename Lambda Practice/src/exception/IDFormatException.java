package exception;

public class IDFormatException extends Exception{
  public IDFormatException(String message){
    super(message); // Exception 클래스의 생성자 호출
    // 에러 메세지를 받기 위해 생성자에 String 을 매개변수로 선언해줌
    // Exception 클래스에도 String을 매개변수로 받는 생성자 존재
  }
}
