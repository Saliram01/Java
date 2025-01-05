package Oops.Polymorphism;

class Parent {
    void print(){
        System.out.println("I am a parent class");
    }
}
class FirstChildClass extends Parent {
    void print(){
        System.out.println("I am a first child class");
    }
}
class SecondChildClass extends Parent{
    void print(){
        System.out.println("I am a second child class");
    }
}
public class RunTimePolymorphism {
    public static void main(String[] args) {
        Parent a;
        a = new Parent();
        a.print();
        a = new FirstChildClass();
        a.print();
        a = new SecondChildClass();
        a.print();
    }
}
