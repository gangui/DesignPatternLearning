package Decorator.clothesDecorator;

public class Person implements ICharacter {
    private String name;

    public Person(String name){
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("Person: " + name);
    }
}
