package Oops.Inheritance;

class GrandDog {
    void eat(){
        System.out.println("Eating...");
    }
}
class ParentDog extends GrandDog{
    void bark(){
        System.out.println("Barking...");
    }
}
class BabyDog extends ParentDog {
    void weep(){
        System.out.println("Weeping...");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        BabyDog bd = new BabyDog();
        bd.eat();
        bd.bark();
        bd.weep();
    }
}
