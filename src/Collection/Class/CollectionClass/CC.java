package Collection.Class.CollectionClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CC {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);

        System.out.println(list);
        System.out.println("Min el : " + Collections.min(list)); // smallest
        System.out.println("Max el : " + Collections.max(list)); // Greatest
        System.out.println("Frequency el: " + Collections.frequency(list,9)); // Repeated count

        Collections.sort(list); // ascending order
        System.out.println(list);
        list.sort(Comparator.reverseOrder()); // descending order
        System.out.println(list);

    }
}
