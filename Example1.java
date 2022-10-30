package LambdaExpressionsJava8;

import java.util.ArrayList;

//Lambda expressions are usually passed as parameters to a function
public class Example1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(55);
        numbers.add(65);
        numbers.add(75);
        numbers.forEach(n -> System.out.println(n));
    }
}
