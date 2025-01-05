package Functional_Program;

import java.util.List;

public class TestMethodInterface {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        numbers.stream()
                .filter(odd -> odd % 2 == 1)
                .forEach(System.out::println);
                    /*
                    * System.out -> Object  , println -> method
                    * MethodReferences -> System.out::println
                    * */
    }
}
