package Decorator.cashDecorator;

/**
 * 满减,满x减y
 */
public class CashReturn extends CashSuper{

    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;

    public CashReturn(ISale sale, double moneyCondition, double moneyReturn) {
        super(sale);
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double price = super.acceptCash(money);
        return price - Math.floor(price/moneyCondition)*moneyReturn;
    }
}
