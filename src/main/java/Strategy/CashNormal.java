package Strategy;


/**
 * 正常收费
 */
public class CashNormal extends CashSuper {
    @Override
    double acceptCash(double money) {
        return money;
    }
}
