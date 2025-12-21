package Decorator.cashDecorator;

public abstract class CashSuper implements ISale{

    private ISale sale;

    public CashSuper(ISale sale) {
        this.sale = sale;
    }

    @Override
    public double acceptCash(double money) {
        double result = 0;
        if (sale != null) {
            result = sale.acceptCash(money);
        }
        return result;
    }

}
