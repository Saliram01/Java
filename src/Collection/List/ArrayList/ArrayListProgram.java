package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListProgram {
    public static void main(String[] args) {
        // Create An Arraylist of Integer
        ArrayList<Integer> list = new ArrayList<>();

        // adding element to a Collection.List.ArrayList
        list.add(50);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(10);
        list.add(3,100);

        /*System.out.println("All Element of LinkedList :- " + list);

        // update value
        list.set(0,500);

        // Add elements at the beginning and end
//        list.addFirst(80);
//        list.addLast(75);

        // Accessing Element by Index
        System.out.println("Element at index 1 is : " + list.get(1));

        // Sorting ArrayList
        Collections.sort(list);
        System.out.println("Sort list :- " + list);

        // Check element index
        if(list.contains(40)){
            System.out.println("Index of 40 is : " + list.indexOf(40));
        }

        // Removing an Element at index
        *//* list.removeLast();
        list.removeFirst();
        list.remove(1);
        System.out.println("Removed element at index 1 is : 20");
        *//*
        // Reverse ArrayList
        Collections.reverse(list);
        System.out.println("Reverse ArrayList :- " + list);

        // remove element at element name
        list.remove(Integer.valueOf(10));

        // Traverse Through Collection.List.ArrayList
        System.out.println("New element in Collection.List.ArrayList are :-");
        for(int el : list){
            System.out.println(el);
        }
        // Clear all elements from the ArrayList
        list.clear();
        System.out.println("ArrayList after clearing: " + list);*/

        // Iterator of ArrayList

        Iterator<Integer> li = list.iterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }

    }
}
