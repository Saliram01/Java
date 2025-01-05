package Overloading_Overriding;

class Animal {
    void sound(){
        System.out.println("Animal make sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog is barking");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat mews");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
        Dog d = new Dog();
        d.sound();
        Cat c = new Cat();
        c.sound();


    }
}
