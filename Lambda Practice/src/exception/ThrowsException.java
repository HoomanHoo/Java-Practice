package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

  public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
    FileInputStream fis = new FileInputStream(fileName);
    Class c = Class.forName(className);
    return c;
  } // throws 키워드를 통해 해당 메서드를 호출한 객체로 Exception 처리를 미룬다

  public static void main(String[] args) {
    ThrowsException ex = new ThrowsException();
    try {
//      ex.loadClass("b.txt", "java.lang.string");
      ex.loadClass("b.txt", "java.lang.String");
    } catch (FileNotFoundException e) {
      System.out.println(e);
    } catch (ClassNotFoundException e) {
      System.out.println(e);
    }
    System.out.println("main end");
//    파일이 없을 때
//    java.io.FileNotFoundException: b.txt (지정된 파일을 찾을 수 없습니다)
//    main end
//    파일은 있는데 클래스 이름이 틀렸을 때
//    java.lang.ClassNotFoundException: java.lang.string
//    main end
//    파일 있고 클래스 이름 맞을 때
//    main end
    // 익셉션 핸들링은 호출한 쪽에서 핸들링 하는 것이 로그 남기기 편하기 때문에 그 쪽에서 수행한다
    // 지정한 익셉션 이외에 또 다른 불특정 익셉션이 발생할 가능성이 있을 경우, 맨 마지막 catch문에 Exception을 잡도록 한다
    // -> Exception을 잡는 catch문이 맨 위에 있을 경우 다른 익셉션들을 잡을 수 없게 된다 -> Exception이 최상위 클래스이기 때문
    // main에서 throws를 사용하면 가상머신에서 처리하게 된다
    // -> 프로그램이 비정상 종료된다
  }
}
