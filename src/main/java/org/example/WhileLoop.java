package org.example;
import java.util.List;

public class WhileLoop {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println("Sum:" + sumUsingWhileLoop(numbers));
    }

    public static int sumUsingWhileLoop(List<Integer> numbers) {
        int sum = 0;
        int index = 0;
        while (index < numbers.size()) {
            sum += numbers.get(index);
            index++;
        }
        return sum;
    }
}
