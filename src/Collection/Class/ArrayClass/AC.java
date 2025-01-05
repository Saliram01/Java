package Collection.Class.ArrayClass;

import java.util.Arrays;

public class AC {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int index = Arrays.binarySearch(numbers,4);
        System.out.println("The index of element 4 in the array is : " + index);

        Integer[] num = {90,2,30,4,25,6,57,8,9};
        Arrays.sort(num);

        Arrays.fill(num,12);

        for (int i : num){
            System.out.println(i + " ");
        }
    }
}
