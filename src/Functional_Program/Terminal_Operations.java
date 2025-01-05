package Functional_Program;

import java.util.List;
import java.util.Optional;

public class Terminal_Operations {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,2,5,1,3);

        // Max Number
        Optional<Integer> maxNumber = numbers.stream()
                .max(Integer::compareTo);
        maxNumber.ifPresent(System.out::println);

        // Min Number
        Optional<Integer> minNumber = numbers.stream()
                .min(Integer::compareTo);
        minNumber.ifPresent(System.out::println);

    }
}
