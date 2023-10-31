public class SingletonEx {

    private String str = "singleton";

    private SingletonEx() { // 외부에서 객체를 생성할 수 없도록 생성자를 private로 제한하였다. 초기화 해줄 멤버가 없기 때문에 어떠한 요소도 초기화 시키지
                            // 않았다.
    }

    private static class SingletonInstance {
        private static final SingletonEx Instance = new SingletonEx(); // singletonEx 객체를 생성하고 Instance라는 이름의 변수에 할당
    }

    public static SingletonEx getInstance() {
        return SingletonInstance.Instance; // 생성된 singleton 객체를 return 해줌 - getInstance()는 외부에서 접근이 가능해야 하기 때문에 접근 제어자
                                           // public을 사용
                                           // 이러한 방식을 LazyHolder이라고 한다
                                           // getInstance() 메서드를 실행하면 SingletonInstance에 접근하게 되며 이 시점에 Instance 객체가 생성된다
                                           // - JVM이 알아서 객체 하나만 메모리에 올리기 때문에 Thread Safe하다
                                           // Instance는 final 타입으로 이후에 다시 할당되는 일이 없다
    }

    @Override
    public String toString() {
        return "SingletonEx의 toString을 오버라이딩 했다 [str=" + str + "]";
    }

}

class SingletonTest {
    public static void main(String[] args) {
        SingletonEx test1 = SingletonEx.getInstance();
        SingletonEx test2 = SingletonEx.getInstance();

        System.out.println(test1.toString());
        System.out.println(test2.toString());

        System.out.println(test1.hashCode()); // hashCode()는 객체의 메모리 번지를 이용해서 해시코드를 만들어 리턴하는 메서드이다
        System.out.println(test2.hashCode());

        System.out.println("테스트 해볼게요 " + SingletonEx.getInstance().toString());
        System.out.println("테스트 해볼게요 " + SingletonEx.getInstance().hashCode());

        if (test1 == test2) { // == 연산자는 Instance의 주소값을 비교한다 따라서 equal이 출력될 경우 두 객체의 Instance 주소값이 같다는 의미로 두
                              // 객체가 같은 Instance를 사용한다는 것을 알 수 있다.
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }
}

/*
 * 실행값
 * SingletonEx의 toString을 오버라이딩 했다 [str=singleton]
 * SingletonEx의 toString을 오버라이딩 했다 [str=singleton]
 * 105704967
 * 105704967
 * equal
 * 
 */
