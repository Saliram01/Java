package Static_Keyword;

class SM {
    static int num = 1;

    SM(){
        num++;
    }
    static void display(){
        System.out.println(num);
    }
}
public class Static_Method {
    public static void main(String[] args) {
        SM.display();
        SM.display();
    }
}
