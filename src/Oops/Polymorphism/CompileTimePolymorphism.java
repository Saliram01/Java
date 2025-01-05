package Oops.Polymorphism;

class Multiply{
    static int Mul(int a, int b){
        return a * b;
    }

    static int Mul(int a ,int b , int c){
        return a * b * c;
    }
}
public class CompileTimePolymorphism {
    public static void main(String[] args) {
        System.out.println(Multiply.Mul(5,10));
        System.out.println(Multiply.Mul(5,10,15));
    }
}
