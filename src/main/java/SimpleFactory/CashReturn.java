package SimpleFactory;

/**
 * 返现
 */
public class CashReturn extends CashSuper{

    // 返现条件
    private double moneyCondition = 0.0d;
    // 返现值
    private double moneyReturn = 0.0d;

    public CashReturn(double moneyCondition,double moneyReturn){
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }
    @Override
    double acceptCash(double money) {
        if (money >= moneyCondition) {
            return money - Math.floor(money/moneyCondition)*moneyReturn;
        }
        return money;
    }
}
