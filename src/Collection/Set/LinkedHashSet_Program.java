package Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet_Program {
    public static void main(String[] args) {
        // it stores set of as a add line by line
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
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
