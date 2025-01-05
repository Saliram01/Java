package Oops.Abstract;

abstract class Animal {
    abstract void sound();
    void eat(){
        System.out.println("This animal eat food");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("The dogs barks");
    }
}
class Cat extends Animal {
    void sound(){
        System.out.println("The cat mews");
    }
}
public class Abstract_Method {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.sound();
        d.eat();
        Animal c = new Cat();
        c.eat();
        c.sound();
    }
}
