package Functional_Program;

import java.util.List;
import java.util.function.Consumer;

public class Filter_Reduce {
    public static void main(String[] args) {

        List<String> fruits = List.of("Apple","Mango","Banana","Orange","Cherry");
        System.out.println(fruits.size());

        System.out.println("Printing fruits using normally");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Printing fruits using stream");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruits) {
                System.out.println(fruits);
            }
        });

        System.out.println("Printing fruits using filter");
        fruits.stream()
            .filter(f -> f.endsWith("e"))
            .forEach(s -> System.out.println(s));

    }
}
