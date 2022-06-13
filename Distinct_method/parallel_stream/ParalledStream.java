package Distinct_method.parallel_stream;

import java.util.*;
import java.util.stream.Collectors;

public class ParalledStream {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("a", "A", "z", "t", "y", "Z");

        List<String> list1 = strList.parallelStream().sorted().collect(Collectors.toList());
        System.out.println(list1);
    }
}
