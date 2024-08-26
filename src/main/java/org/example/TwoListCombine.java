package org.example;

import java.util.ArrayList;
import java.util.List;

public class TwoListCombine {
    public static <T, U> List<Object> combineListsAlternating(List<T> list1, List<U> list2) {
        List<Object> combinedList = new ArrayList<>();
        int size = Math.min(list1.size(), list2.size());

        for (int i = 0; i < size; i++) {
            combinedList.add(list1.get(i));
            combinedList.add(list2.get(i));
        }

        //Check equal size ?
        if (list1.size() > size) {
            combinedList.addAll(list1.subList(size, list1.size()));
        } else if (list2.size() > size) {
            combinedList.addAll(list2.subList(size, list2.size()));
        }

        return combinedList;
    }

    public static void main(String[] args) {
        List<Character> list1 = List.of('a', 'b', 'c');
        List<Integer> list2 = List.of(1, 2, 3);

        List<Object> combinedList = combineListsAlternating(list1, list2);

        System.out.println(combinedList);
    }
}

