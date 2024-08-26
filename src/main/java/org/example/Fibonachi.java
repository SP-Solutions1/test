package org.example;

import java.util.ArrayList;
import java.util.List;

public class Fibonachi {
    public static List<Double> generateFibonacci(int n) {
        List<Double> fibonacciList = new ArrayList<>();
        double a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            fibonacciList.add(a);
            double next = a + b;
            a = b;
            b = next;
        }

        return fibonacciList;
    }

    public static void main(String[] args) {
        List<Double> first100FibonacciNumbers = generateFibonacci(100);
        for (Double num : first100FibonacciNumbers) {
            System.out.println(num);
        }
    }













//    public static List<Long> getFirst100FibonacciNumbers() {
//        List<Long> fibonacciNumbers = new ArrayList<>(100);
//
//        long first = 0;
//        long second = 1;
//
//        fibonacciNumbers.add(first);
//        fibonacciNumbers.add(second);
//
//        for (int i = 2; i < 10; i++) {
//            long next = first + second;
//            fibonacciNumbers.add(next);
//            first = second;
//            second = next;
//        }
//
//        return fibonacciNumbers;
//    }
//
//    public static void main(String[] args) {
//        List<Long> fibonacciNumbers = getFirst100FibonacciNumbers();
//        for (Long number : fibonacciNumbers) {
//            System.out.println(number);
//        }
//    }

}
