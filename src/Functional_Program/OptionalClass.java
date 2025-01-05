package Functional_Program;

import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {

        List<Integer> num = List.of(1,2,3,4,5,6,7,8,9,10);
        Optional<Integer> number = num.stream()
                .reduce((a,b) -> a + b);
        if(number.isPresent()) {
            System.out.println(number.get());
        }
        else {
            System.out.println("List is empty");
        }
    }
}
