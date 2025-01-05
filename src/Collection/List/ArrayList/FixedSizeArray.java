package Collection.List.ArrayList;

import java.util.Arrays;
import java.util.List;

public class FixedSizeArray {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(number);

        number.set(0,10);
        System.out.println(number);

        /*
        *
        * We cannot remove and add element but can update.
        *
        * */

    }
}
