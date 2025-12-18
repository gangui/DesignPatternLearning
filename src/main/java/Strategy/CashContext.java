package Strategy;

public class CashContext {
    private CashSuper cashSuper;

    public CashContext(String type) {

        this.cashSuper = switch (type) {
            case "正常收费" -> new CashNormal();
            case "打八折" -> new CashRebate(0.8);
            case "满三百减一百" -> new CashReturn(300,100);
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
