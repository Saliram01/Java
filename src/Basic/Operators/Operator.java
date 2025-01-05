package Basic.Operators;

public class Operator {
    public static void main(String[] args) {
        /*
        + - * / %               -> Arithmetic Operator
        > < >= <= == !          -> Conditional or Relational Operator
        && || ?                 -> Logical Operator
        += -= *= /=  %=         -> Arithmetic Asign Operator
        & | >> << ~ ^ >>>       -> Boolean Operator
        ++ --                   -> Increment and Decrement
    */

        int a = 5, b = 8;
        System.out.println(a > b && b > a);
    }
}
