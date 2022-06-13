package filter_method;
import java.util.*;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        // ArrayList<Integer> al = new ArrayList<>();
        List<Integer> list1 = Arrays.asList(1, 2, 3, 7, 8, 10, 12, 15);
        List<Integer> list2 = new ArrayList<>();
        // for (Integer integer : list1) {
        //     if(integer%2 == 0){ 
        //      list2.add(integer);   
        //     }
        // }

      //  System.out.println(list2);

      // Stream API
        list2 = list1.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
        System.out.println(list2);

        // System.out.println(list1.stream().filter(n -> n%2 == 0).collect(Collectors.toList()));

        list1.stream().filter(n -> n%2 == 0).forEach(n -> System.out.print(n + " "));

        list1.stream().filter(n -> n%2 == 0).forEach(System.out::println);
    }
}