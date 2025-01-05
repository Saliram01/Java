package Basic.Array;

import java.util.Arrays;

public class Array_ {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("First Method Basic.Array Value : " + arr[8]);

        int[] number = new int[5];
        number[0] = 5;
        number[1] = 4;
        number[3] = 3;
        number[2] = 2;
        number[4] = 1;
        System.out.println("Second Method Basic.Array Value : " + number[0]);

        // Iterate in arrays

        System.out.println("1st method");
        Arrays.stream(number).forEach(System.out::println);

        System.out.println("2nd method");
        for (int el : arr) System.out.print(el + " ");

    }
}
