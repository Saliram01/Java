package Collection.Set;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet_program {
    public static void main(String[] args) {
        // It stores data orderly
        TreeSet<Integer> set = new TreeSet<>();
        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);

        System.out.println(set);
        set.remove(54);
        System.out.println(set);
        System.out.println(set.contains(100)); // it checks the value
        System.out.println(set.isEmpty()); // it checks the set is mt or not return boolean
        System.out.println(set.size());
        set.clear(); // it clears all set of list
    }
}
