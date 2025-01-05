package Collection.Queue;

import java.util.Queue;

public class QLinkedList {
    public static void main(String[] args) {
        // FIFO
        Queue<Integer> queue = new java.util.LinkedList<>();

        queue.offer(12); // 1th el  -> offer is used to add element in queue
        queue.offer(14); // 2th el
        queue.offer(16); // 3rd el
        queue.offer(18); // 4nd el
        queue.offer(20); // 5st el

        System.out.println(queue);
        System.out.println(queue.poll()); // poll is used to remove el
        System.out.println(queue);
        System.out.println(queue.peek()); //

    }
}
