package Decorator.cashDecorator;

public class CashRebate extends CashSuper {

    private double moneyRebate;

    public CashRebate(ISale iSale, double moneyRebate) {
        super(iSale);
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        double price = super.acceptCash(money);
        return price * moneyRebate;
    }
}
