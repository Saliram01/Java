package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class Hash {
    public static void main(String[] args) {
        // In HashMap are accept only unique key
        HashMap<String, Integer> numb = new HashMap<>();
        numb.put("One",1);
        numb.put("Two",2);
        numb.put("Three",3);
        numb.put("Four",4);
        numb.put("Five",5);

//        if(!numb.containsKey("Two")){
//            numb.put("Two",23);
//        }
        // if condition or putIfAbsent both do same
        numb.putIfAbsent("Two",23);

        for(Map.Entry<String, Integer> e: numb.entrySet()){
//            System.out.println(e);
            System.out.print(e.getKey() + " : ");
            System.out.println(e.getValue());
        }

        for(String key : numb.keySet()){
            System.out.println(key);
        }

        System.out.println(numb.containsValue(3));
        System.out.println(numb.isEmpty());
        numb.clear();

//        System.out.println(numb);
    }
}
