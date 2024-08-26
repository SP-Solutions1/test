package org.example;
import java.util.List;

public class WhileLoop {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int sum = 0;
        int index = 0;
        while (index < numbers.size()) {
            sum += numbers.get(index);
            index++;
        }
        System.out.println("sum="+sum);
    }
}
