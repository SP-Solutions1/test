package org.example;

import java.util.List;

public class Recursion {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5,6);
        int result = sum(numbers);
        System.out.println("Sum: " + result);
    }

    public static int sum(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        // add first element to sum of rest
        return numbers.get(0) + sum(numbers.subList(1, numbers.size()));
    }
}

