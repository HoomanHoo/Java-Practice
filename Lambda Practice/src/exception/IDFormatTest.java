package exception;

public class IDFormatTest {

  private String userId;

  public String getUserId(){
    return userId;
  }

  public void setUserId(String userId) throws IDFormatException{

    if(userId == null){
      throw new IDFormatException("ID must not null");
    }

    if(userId.length() < 8 || userId.length() > 20){
      throw new IDFormatException("ID length is must over 8 character or under 20 character");
    }

    this.userId = userId;
  }
  public static void main(String[] args) {
    IDFormatTest idTest = new IDFormatTest();
    String userId = null;
    try {
      idTest.setUserId(userId);
    } catch (IDFormatException e) {
      System.out.println(e);
    }
    System.out.println("main end");

//    ID가 null일 때
//    exception.IDFormatException: ID must not null
//    main end

    try {
      idTest.setUserId("123");
    } catch (IDFormatException e) {
      System.out.println(e);
      System.out.println(e.getMessage()); // 에러 메세지만 얻을 때 사용
//      exception.IDFormatException: ID length is must over 8 character or under 20 character
//      ID length is must over 8 character or under 20 character
    }
//    ID가 8자 이하거나 20자 이상일 때
//    exception.IDFormatException: ID length is must over 8 character or under 20 character

  }
}
