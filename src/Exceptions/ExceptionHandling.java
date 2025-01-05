package Exceptions;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first num : ");
        int first = input.nextInt();
        System.out.print("Enter second num : ");
        int second = input.nextInt();

        try {
            int div = first / second;
            System.out.println(div);
        }
        catch (ArithmeticException e){
            System.out.println("Divide by zero occurred " + e);
        }
        finally {
            System.out.println("Program is executed successfully!!");
        }
    }
}
