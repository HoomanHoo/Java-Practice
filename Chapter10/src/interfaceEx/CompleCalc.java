package interfaceEx;

public class CompleCalc extends Calculator {

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        }

        return ERROR;
    }

    public void showInfo() {
        System.out.println("implements Calc interface");
    }

}
