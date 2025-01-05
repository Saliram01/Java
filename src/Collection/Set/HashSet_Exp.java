package Collection.Set;

import java.util.HashSet;

public class HashSet_Exp {
    public static void main(String[] args) {
        // it stores randomly set of list
        HashSet<Integer> set = new HashSet<>();
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
