abstract class FountainPen { // M800과 Montblanc149의 공통점인 Fountainpen을 추상클래스로 추상화 하였다.
                             // 추상화 하며 공통 기능인 가격 표시 기능을추상메서드로 선언하였다
                             // 추상 클래스는 구현 메서드가 들어가도 된다
    public abstract int getPrice(); // 추상메서드는 선언부만 존재하고 구현부가 없다

    // protected int price;

    @Override
    public String toString() {
        return "This fountain pen is " + this.getPrice() + " hash code is " + this.hashCode();
    }

    public void testMethod() {
        System.out.println("this is test method");
    }
}

public class factoryEx {
    public static FountainPen getPen(String type, int price) { // 생성하고자 하는 객체의 부모 클래스인 Fountainpen 타입으로 리턴 타입을 지정
        if ("M800".equalsIgnoreCase(type)) { // 조건에 따라 어떤 객체를 생성하여 리턴할 것인지 지정한다
            return new M800(price); // M800, Montblanc149는 모두 FountainPen의 자식 클래스기 때문에 부모타입을 리턴 타입으로 지정할 수 있다.
        } else if ("Montblanc149".equalsIgnoreCase(type)) {
            return new Montblanc149(price);
        } else {
            return new DefaultFountainpen();
        }
    }
}

class DefaultFountainpen extends FountainPen { // 미리 정의한 추상클래스를 상속받아 구현한다.
    private int price;

    public DefaultFountainpen() {
        this.price = -1;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

class M800 extends FountainPen {
    private int price;

    public M800(int price) {
        this.price = price;
        // super.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
        // return super.price;
    }
}

class Montblanc149 extends FountainPen {
    private int price;

    public Montblanc149(int price) {
        this.price = price;
        // super.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
        // return super.price;
    }
}

class FountainpenTest {
    public static void main(String[] args) {
        FountainPen m800 = factoryEx.getPen("M800", 500000); // FountainPen을 상속받아 구현한 하위 클래스 중 원하는 클래스를 인스턴스화 하여 사용한다
        FountainPen mont149 = factoryEx.getPen("Montblanc149", 1000000);

        System.out.println("M800 = " + m800);
        System.out.println("Montblanc149 = " + mont149);
        m800.testMethod();
    }
}

/*
 * 출력값
 * M800 = This fountain pen is 500000 hash code is 1521118594
 * Montblanc149 = This fountain pen is 1000000 hash code is 1190524793
 * this is test method
 */

/*
 * abstract class에 protected 멤버를, extended class에 super 키워드를 사용한 출력값
 * M800 = This fountain pen is 500000 hash code is 1521118594
 * Montblanc149 = This fountain pen is 1000000 hash code is 1190524793
 * this is test method
 */
