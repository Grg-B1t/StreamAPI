package flatMap_method;

import java.util.*;

public class flatmapDemo {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> list3 = Arrays.asList(21, 41, 54, 85, 78, 61, 74, 75);

        List<List<Integer>> finalList = Arrays.asList(list1, list2, list3);

        // for (List<Integer> list : finalList) {
        //     for (Integer lst : list) {
        //             System.out.print(lst + " ");
        //     }
        //     System.out.println();
        // }

        finalList.stream().flatMap(x -> x.stream()).map(s -> s + 10).forEach(x -> System.out.print(x + " "));
    }
}
