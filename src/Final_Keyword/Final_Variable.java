package Final_Keyword;

public class Final_Variable {
    final int PI = 12;

    void changeValue(){
//        PI = 15;
    }
    void displayPrint(){
        System.out.println("PI value is : " + PI);
    }
    public static void main(String[] args) {
        Final_Variable fv = new Final_Variable();
        fv.displayPrint();
    }
}
