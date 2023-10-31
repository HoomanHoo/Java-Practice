import java.util.ArrayList;
import java.util.List;

interface PaymentStrategy { // 구현하고자 하는 전략의 공통 부분을 선언한다
    public void pay(int amount);
}

class KakaoCardStrategy implements PaymentStrategy { // 공통 인터페이스를 상속받아 세부 사항을 구현한다
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public KakaoCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) { // 공통 부분을 구현하고자 하는 전략에 맞춰 구현한다
        System.out.println(amount + " paid using Kakao Card");
    }
}

class LunaCardStrategy implements PaymentStrategy {
    private String emailId;
    private String passwd;

    public LunaCardStrategy(String emailId, String passwd) {
        this.emailId = emailId;
        this.passwd = passwd;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Luna Card");
    }
}

class Item {
    private String name;
    private int price;

    public Item(String name, int cost) {
        this.name = name;
        this.price = cost;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}

class Cart {
    List<Item> items;

    public Cart() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calculate() {
        int sum = 0;
        for (Item item : this.items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void paying(PaymentStrategy paymentStrategy) {
        int amount = calculate();
        paymentStrategy.pay(amount);
    }
}

public class StrategyEx {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Item pen = new Item("ballpen", 5000);
        Item papers = new Item("gokuyo", 20000);

        cart.addItem(pen);
        cart.addItem(papers);

        cart.paying(new KakaoCardStrategy("park", "34341122", "774", "06/21")); // 미리 구현해둔 전략 중 원하는 전략을 골라 연산을 수행한다

        cart.paying(new LunaCardStrategy("guzalsin@heros.com", "123123"));
    }
}

/*
 * 결과값
 * 25000 paid using Kakao Card
 * 25000 paid using Luna Card
 */
