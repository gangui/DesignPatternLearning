package Decorator.clothesDecorator;

public class TestDecorator {
    public static void main(String[] args) {
        Person person = new Person("小王");
        Finery tShirts = new TShirts(person);
        Finery suit = new Suit(tShirts);
        suit.show();
    }
}
