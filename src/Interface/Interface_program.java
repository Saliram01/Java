package Interface;

interface Animal {
    void makeSound();
    void eat();
}
class Dog implements Animal {
    public void makeSound(){
        System.out.println("The dog barks");
    }
    public void eat(){
        System.out.println("The dog eats food");
    }
}
class Cat implements Animal {
    public void makeSound(){
        System.out.println("The cat mews");
    }
    public void eat(){
        System.out.println("The cat eats food");
    }
}

public class Interface_program {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        dog.eat();

        Animal cat = new Cat();
        cat.makeSound();
        cat.eat();

    }
}
