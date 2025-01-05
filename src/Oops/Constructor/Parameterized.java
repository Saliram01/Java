package Oops.Constructor;

class ParameterizedConstructor {
    String name;

    ParameterizedConstructor(String name) {
        this.name = name;
    }

    void display(){
        System.out.println(name);
    }

}

public class Parameterized {
    public static void main(String[] args) {
        ParameterizedConstructor pc = new ParameterizedConstructor("I Am Parameterized Constructor");
        pc.display();
    }
}
