package Decorator.cashDecorator;

public class TestCashDecorator {
    public static void main(String[] args) {
        CashContext cashContextNormal = new CashContext(1);
        double result = cashContextNormal.getResult(200);
        System.out.println("正常收费：" + result);

        CashContext cashContext2 = new CashContext(3);
        result = cashContext2.getResult(800);
        System.out.println("满减收费：" + result);
    }
}
