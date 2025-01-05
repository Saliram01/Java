package Basic._Intro;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = sc.nextLine();
        System.out.printf("Hello %s",message);
        sc.close();
    }
}
