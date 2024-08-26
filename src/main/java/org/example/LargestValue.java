package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class LargestValue {
    public static String formLargestNumber(int[] numbers) {

        String[] stringNumbers = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        Arrays.sort(stringNumbers, new Comparator<String>() {
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                System.out.println("order"+order2.compareTo(order1));
                return order2.compareTo(order1); // descending order
            }
        });

        if (stringNumbers[0].equals("0")) {
            return "0";
        }

        StringBuilder largestNumber = new StringBuilder();
        for (String number : stringNumbers) {
            largestNumber.append(number);
        }

        return largestNumber.toString();

    }

    public static void main(String[] args) {
        int[] numbers = {50, 2, 1, 9};
        System.out.println("The largest number is: " + formLargestNumber(numbers));
    }
}


