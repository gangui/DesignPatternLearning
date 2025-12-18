package Strategy;

public class TestStrategy {
    public static void main(String[] args) {
        CashContext cash = new CashContext("打八折");
        double result = cash.getResult(100);
        System.out.println("打八折：" + result);
    }
}
