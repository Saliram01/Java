package Oops.Abstract;

abstract class Language {
    void display(){
        System.out.println("Vehicle is running");
    }
}

public class Abstract_Class extends Language{

    public static void main(String[] args) {

        Abstract_Class ab = new Abstract_Class();
        ab.display();
    }
}
