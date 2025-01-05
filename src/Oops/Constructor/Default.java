package Oops.Constructor;

class DefaultConstructor {
    String name;

    DefaultConstructor(){
        this.name = "I Am Default Constructor";
    }

    void display(){
        System.out.println(name);
    }

}

public class Default {
    public static void main(String[] args) {
        DefaultConstructor d = new DefaultConstructor();
        d.display();
    }
}
