package Basic.Loop;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        while(age < 0 || age > 100) {
            System.out.print("Enter your age : ");
            age = sc.nextInt();
        }
        System.out.println("Your age is " + age);
        System.out.println("Program is end");
        sc.close();
    }
}
