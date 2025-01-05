package Static_Keyword;

class SB {
    String name;

    static {
        System.out.println("I am a static block");
    }

    SB(String name){
        this.name = name;
    }

    void display(){
        System.out.println("My name is " + name);
    }
}

public class Static_Block {
    public static void main(String[] args) {

        SB sb = new SB("SaliRam");
        sb.display();
    }
}
