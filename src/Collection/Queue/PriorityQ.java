package Collection.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> number = new PriorityQueue<>(); // priority from the smallest remove
        PriorityQueue<Integer> number2 = new PriorityQueue<>(Comparator.reverseOrder());
        // priority from Greatest remove
        number.add(1);
        number.add(3);
        number.add(5);
        number.add(7);
        System.out.println("First priority is smallest");
        System.out.println(number);
        number.poll(); // it removes the smallest number of priority 1st
        System.out.println(number);
        System.out.println(number.peek());
    }
}
