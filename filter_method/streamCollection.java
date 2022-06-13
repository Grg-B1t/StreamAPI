package filter_method;

import java.util.*;
import java.util.stream.Collectors;

public class streamCollection{
    public static void main(String[] args) {
        List<String> carList = Arrays.asList("Nissan", "Toyota", "Subaru", "Ram", "Honda", "Pontiac", "Chevy", null, "GM", "Infinity", "Lexus", null, "Mini Cooper", "BMW", null, "Ford", "Volkswagon", null, "Tata", 
        "tesla");
        List<String> sList;
        List<String> sList1;
        List<String> sList2;

        sList = carList.stream().filter(c -> c != null).collect(Collectors.toList());
        sList1 = carList.stream().filter(c -> c != null && c.endsWith("a")).collect(Collectors.toList());
        sList2 = carList.stream().filter(c -> c != null && c.contains("a")).collect(Collectors.toList());

        System.out.println(sList);
        System.out.println(sList1);
        System.out.println(sList2);

    }
}