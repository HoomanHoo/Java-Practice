package exception;

public class AutoCloseTest {

  public static void main(String[] args) {
    try(AutoCloseObj obj = new AutoCloseObj()) {
      throw new Exception();  // Exception을 발생시킴
    } catch (Exception e) {
      System.out.println("Exception");
    }
//    정상 종료시
//    close method called
//    익셉션 발생 시
//    close method called
//    Exception

  //자바 8 이후로는 try문에서 객체 생성하지 않고 그 바깥에서 생성된 객체도 try-with-resource문 사용 가능
    // -> 향상된 try-with-resource문
    AutoCloseObj obj2 = new AutoCloseObj();
    try(obj2){
      throw new Exception();
    }
    catch(Exception e){
      System.out.println("Exception2");
    }
  }

}
