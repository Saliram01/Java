package Collection.Map;

import java.util.TreeMap;

public class Tree {
    public static void main(String[] args) {

        TreeMap<String, Integer> numb = new TreeMap<>();
        numb.put("One",1);
        numb.put("Two",2);
        numb.put("Three",3);
        numb.put("Four",4);
        numb.put("Five",5);

        System.out.println(numb);

        numb.remove("Three");

        System.out.println(numb);
    }
}
