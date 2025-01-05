package Collection.List.Stack;

import java.util.Stack;

public class Stack_Program {
    public static void main(String[] args) {
        // Stand For LIFO
        Stack<String> lang = new Stack<>();

        lang.push("java"); // 4th el
        lang.push("Spring"); // 3rd el
        lang.push("React"); // 2nd el
        lang.push("JavaScript"); // 1st el

        System.out.println(lang);
        System.out.println(lang.peek());

        lang.pop(); // remove el
        System.out.println(lang);
        System.out.println(lang.peek()); // access first value

    }
}
