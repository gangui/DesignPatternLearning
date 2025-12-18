package SimpleFactory;

public class TestSimpleFactory {
    public static void main(String[] args) {
        CashFactory cashFactory = new CashFactory();
        CashSuper cashSuper = cashFactory.createCashSuper("正常收费");
        double v = cashSuper.acceptCash(100);
        System.out.println("正常收费" + v);

        CashSuper cashSuper1 = cashFactory.createCashSuper("满300返100");
        double v1 = cashSuper1.acceptCash(500);
        System.out.println("满300返100:" + v1);
    }
}
