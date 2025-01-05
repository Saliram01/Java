package Static_Keyword;

class Keyword {
    static int count = 0;

    Keyword(){
        count++;
    }
    void display(){
        System.out.println(count);
    }
}
public class StaticVariable {
    public static void main(String[] args) {

    Keyword k = new Keyword();
    k.display(); // output: 1

    Keyword k2 = new Keyword();
    k2.display(); // output: 2

    }
}
