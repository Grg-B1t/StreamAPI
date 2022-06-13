package Distinct_method;

import java.util.*;
import java.util.stream.Collectors;

public class sortedArray {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(9, 5, 4, 1, 2, 11, 45, 56, 12);
        List<String> strList = Arrays.asList("a", "A", "z", "t", "y", "Z");

        List<Integer> sortNumList = numList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortNumList);

        List<Integer> sortDescNumList = numList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortDescNumList);

        List<String> sortStrList = strList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortStrList);

        List<String> sortDescStrList = strList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortDescStrList);
    
    }
}
