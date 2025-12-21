package Decorator.cashDecorator;

public class CashNormal implements ISale{
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
