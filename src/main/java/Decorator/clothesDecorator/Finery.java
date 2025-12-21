package Decorator.clothesDecorator;

public class Finery implements ICharacter{

    protected ICharacter character;

    public Finery(ICharacter  character) {
        this.character = character;
    }


    @Override
    public void show() {
        character.show();
    }
}
