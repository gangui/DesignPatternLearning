package Decorator.clothesDecorator;

public class Suit extends Finery {

    public Suit(ICharacter character) {
        super(character);
    }

    @Override
    public void show() {
        System.out.println("穿上了西装 ");
        super.show();
    }
}
