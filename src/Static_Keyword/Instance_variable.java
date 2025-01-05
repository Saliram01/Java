package Static_Keyword;

class Instance {
    int count = 0;

    Instance(){
        count++;
    }

    void display(){
        System.out.println(count);
    }
}
public class Instance_variable {
    public static void main(String[] args) {
        Instance i = new Instance();
        i.display(); // output: 1

        Instance i1 = new Instance();
        i1.display(); // output: 1
    }
}
