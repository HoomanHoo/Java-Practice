import java.util.Scanner;

public class SacnnerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1번 값 입력: ");
        String value1 = scanner.nextLine();

        System.out.println("2번 값 입력: ");
        String value2 = scanner.nextLine();

        System.out.println("1번 값: " + value1 + " 2번 값: " + value2);

    }
}
