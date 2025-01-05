package Final_Keyword;

class Parent {
    final void displayMessage(){
        System.out.println("This is the parent class method");
    }
}
class Child extends Parent {
//    void displayMessage() {
//        System.out.println("Trying to overriding method");
//    }
}
public class Final_Method {
    public static void main(String[] args) {
        Child c = new Child();
        c.displayMessage();
    }
}
