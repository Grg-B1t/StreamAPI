package Distinct_method;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class concatStream {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("one", "two", "Four", "Six", "Nine");
        List<String> list2 = Arrays.asList("Eleven", "Thirty", "Forty", "Sixty", "Ninety");
        
        Stream<String> st1 = list1.stream();
        Stream<String> st2 = list2.stream();

        List<String> str1 = Stream.concat(st1, st2).collect(Collectors.toList());

        System.out.println(str1);

        List<Integer> numlist1 = Arrays.asList(1, 3, 4, 5, 9);
        List<Integer> numlist2 = Arrays.asList(11, 22, 33, 55, 99);
        
        Stream<Integer> numSt1 = numlist1.stream();
        Stream<Integer> numSt2 = numlist2.stream();

        List<Integer> str2 = Stream.concat(numSt1, numSt2).collect(Collectors.toList());

        System.out.println(str2);
        

    }
}
