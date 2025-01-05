package Collection.Queue;

import java.util.ArrayDeque;

public class ArrayDeque_Example {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23); // come from queue
        adq.offerFirst(12); // from Deque
        adq.offerLast(45); // from Deque
        adq.offer(26);

        System.out.println(adq);
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll()); // poll,first,last all are used to remove
        System.out.println("poll()" + adq);

        System.out.println(adq.pollFirst());
        System.out.println("pollFirst()" +adq);

        System.out.println(adq.pollLast());
        System.out.println("pollLast()" +adq);

    }
}
