package Decorator.cashDecorator;

public class CashContext {
    private ISale cashSuper;

    public CashContext(int cashType) {
        switch (cashType) {
            // 不打折
            case 1:
                cashSuper = new CashNormal();
                break;
                // 打八折
            case 2:
                cashSuper = new CashRebate(new CashNormal(), 0.8);
                break;
                // 先打八折，再满五百减100
            case 3:
                cashSuper = new CashReturn(new CashRebate(new CashNormal(), 0.8), 500, 100);
                break;
            default:
                cashSuper = new CashNormal();
                break;
        }
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
