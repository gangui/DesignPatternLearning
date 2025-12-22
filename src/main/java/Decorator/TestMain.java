package Decorator;

import Decorator.cashDecorator.CashNormal;
import Decorator.cashDecorator.CashSuper;
import Decorator.cashDecorator.ISale;

public class TestMain {
    public static void main(String[] args) {
        ISale cashSuper = new CashNormal();
    }
}
