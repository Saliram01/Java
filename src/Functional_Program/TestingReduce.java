package Functional_Program;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer> numList = List.of(1,2,3,4,5,6,7,8);

        int newSum = numList.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer + integer2;
                    }
                });
        System.out.println("Sum using reduce form newSum is : " + newSum);

       int newSum2 = numList.stream().reduce(0,( a,b) -> a + b);
        System.out.println("Sum using reduce from newSum2 is : " + newSum2);


        int maxValue = numList.stream()
                .reduce(Integer.MIN_VALUE,( a,b) -> a > b ? a : b);
        System.out.println("Find max value using reduce method is : " + maxValue);

    }
}
