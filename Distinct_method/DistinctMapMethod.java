package Distinct_method;

import java.util.*;
import java.util.stream.Collectors;;

public class DistinctMapMethod {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(21, 41, 54, 85, 78, 21, 45, 75, 61, 74, 75);

        // Distinct to remove duplicate value and retrieve unique collection
        // Limit to retrieve limited collections of items
        List<Integer> list = list1.stream().distinct().limit(5).collect(Collectors.toList());

        System.out.println(list);

        List<Integer> limitList = list1.stream().limit(3).distinct().collect(Collectors.toList());

        System.out.println(limitList);

        // Count method - for counting a specific element of a collection
        long count = list1.stream().distinct().count();
        System.out.println(count);

        long count1 = list1.stream().filter(s -> s%2 == 0).count();
        System.out.println(count1);

        // Min method - return integer in optional object
        Optional<Integer> op = list1.stream().min((a, b) -> {return a.compareTo(b);});
        System.out.println(op.get());

         // Max method - return integer in optional object
        Optional<Integer> op1 = list1.stream().max((a, b) -> {return a.compareTo(b);});
        System.out.println(op1.get());

        // Reduce method - 
        System.out.println("------------Reduce Method----------------");
        List<Integer> redNum = Arrays.asList(1, 2, 3, 4);
        Optional<Integer> list2 = redNum.stream().limit(4).reduce((a, b) -> {return a*b;});
        System.out.println(list2.get());
       // System.out.println(Integer.MAX_VALUE);
       System.out.println(Integer.MIN_VALUE);

       // Converting ArrayList to array
       Object[] arr = list1.stream().toArray();

     //  Object[] arr1 = list1.toArray();
        
       System.out.println(arr.length);

       for (int index = 0; index < arr.length; index++) {
           System.out.print(arr[index] + " ");
       }

    }
}
