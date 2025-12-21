package Decorator.clothesDecorator;

public class TShirts extends Finery {

    public TShirts(ICharacter character) {
        super(character);
    }

    @Override
    public void show() {
        System.out.println("穿上了T恤 ");
        super.show();
    }
}
