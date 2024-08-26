package org.example;
import java.util.List;

public class ForLoop {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println("num="+numbers);
        System.out.println("Sum: " + sumUsingForLoop(numbers));
    }

    public static int sumUsingForLoop(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
