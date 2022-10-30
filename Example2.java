package LambdaExpressionsJava8;

import java.util.ArrayList;
import java.util.function.Consumer;

//Using Java consumer interface to store a lambda expression in a variable
public class Example2 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        Consumer<Integer> method = n-> System.out.println(n);
        numbers.forEach(method);
    }
}
