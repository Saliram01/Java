package Final_Keyword;

final class FinalMessage {
    void showMessage(){
        System.out.println("This is a final class");
    }
}

//class Subclass extends FinalMessage {
//    void showMessage() {
//        System.out.println("This is a child class");
//    }
//}
public class Final_Class {
    public static void main(String[] args) {
        FinalMessage fm = new FinalMessage();
        fm.showMessage();
    }
}
