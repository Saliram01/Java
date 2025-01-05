package Collection.List.LinkedList;

import java.util.LinkedList;

public class LinkedListProgram {
    public static void main(String[] args) {
        // Create a Collection.List.LinkedList of String
        LinkedList<String> ll = new LinkedList<>();

        // Adding Element to The Collection.List.LinkedList
        ll.add("Apple");
        ll.add("Mango");
        ll.add("Banana");
        ll.add("Orange");
        ll.add("Guava");
        ll.add(5,"Java");

        System.out.print("All element in linkedList :- " + ll);

        // Add elements at the beginning and end
        ll.addFirst("Ruby");
        ll.addLast("Go");

        // Display the LinkedList after additions
        System.out.println("\nExtra 2 element added in linkedList :- " + ll);

        // Access element by index
        System.out.println("\nElement at 1 index is : " + ll.get(1));

        // Remove element by index
        ll.remove(1);
 //      ll.removeFirst();
//        ll.removeLast();
        System.out.println("Remove 1 index element is : Mango");

        // Traverse Through Collection.List.LinkedList
        System.out.println("New element in linkedList");
        for (String str : ll){
            System.out.println(str);
        }
    }
}
