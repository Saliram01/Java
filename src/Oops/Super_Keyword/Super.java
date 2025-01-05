package Oops.Super_Keyword;

class ParentColor {
    String color = "white";
}
class ChildColor extends ParentColor{
    String color = "black";

    void display(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class Super {
    public static void main(String[] args) {
        ChildColor cc = new ChildColor();
        cc.display();
    }
}
