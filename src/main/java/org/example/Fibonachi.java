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
}
