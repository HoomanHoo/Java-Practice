package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ArrayExceptionTest {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    try {
      for (int i = 0; i < 6; i++) {
        System.out.println(arr[i]);
      }
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println(e);
      System.out.println("======================");
      e.printStackTrace();
    }
    System.out.println("ArrayIndexOutOfBoundsException end");
    System.out.println("======================");
    // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    // ArrayIndexOutOfBoundsException은 배열의 범위를 넘어서서 접근할 때 발생하는 오류
    // 익셉션이 발생한다고 해서 모든 곳에 try-catch를 걸지는 않음
    // try-catch-finally 구문에서 finally에는 파일 스트림 닫기나 커넥션 닫기 등의 역할을 수행하는 코드를 둔다

    FileInputStream fis = null;

    try{
      fis = new FileInputStream("a.txt");
      //return;
    }
    catch (FileNotFoundException e){
      System.out.println("first catch");
      e.printStackTrace();
    }
    finally {
      try {
        fis.close();
      } catch (Exception e) {
        System.out.println("second catch");
        e.printStackTrace();
      }
      finally {
        System.out.println("inner finally");
      }
      System.out.println("outer finally");
    }
    System.out.println("end");
    System.out.println("======================");
//    파일이 존재하지 않을 때
//    first catch
//    second catch
//    inner finally
//    outer finally
//    end
//    파일이 존재할 때 - 첫번째 try문에 return이 있어도 finally 블록은 실행됨 - 단 finally 블록 밖은 실행되지 않음
//    inner finally
//    outer finally
//    end

    // try-with-resource문
    try(FileInputStream fis2 = new FileInputStream("a.txt")){

    }
    catch (IOException e){
      System.out.println("catch");
      e.printStackTrace();
    }
    System.out.println("try-with-resource is end");
    System.out.println("======================");
//    파일이 존재하지 않을 때
//    catch
//    try-with-resource is end
//    ======================
//    파일이 존재할 때
//    try-with-resource is end
//    ======================




  }


}
