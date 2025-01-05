package Basic.Function;

import java.util.Scanner;

public class Func {
    public static int Sum(int a, int b) {
        return a + b;
    }

    public static int Sub(int a, int b) {
        return a - b;
    }

    public static int Mul(int a, int b) {
        return a * b;
    }

    public static int Div(int a, int b) {
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        System.out.println("=========================");

        int sum = Sum(a,b);
        System.out.println("Sum of two number is : " + sum);

        int sub = Sub(a,b);
        System.out.println("Sub of two number is : " + sub);

        int mul = Mul(a,b);
        System.out.println("Mul of two number is : " + mul);

        int div = Div(a,b);
        System.out.println("Div of two number is : " + div);

        sc.close();
    }
}
