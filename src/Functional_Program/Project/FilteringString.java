package Functional_Program.Project;

import java.util.List;

public class FilteringString {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple","Banana","Mango","Orange","Guava");
        String result = fruits.stream()
                .filter(str -> str.length() > 5)
                .reduce("", (a,b) -> a + " " + b);
        System.out.println(result);
    }
}
