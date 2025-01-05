package Functional_Program.Project;

import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,2,5,3,4,6,2);

        List<Integer> distNumber = numbers.stream()
                .distinct() // remove the duplicate number only
                .collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(distNumber);

    }
}
