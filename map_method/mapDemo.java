package map_method;

import java.util.*;
import java.util.stream.Collectors;
import filter_method.Car;
import filter_method.Student;

public class mapDemo {
    public static void main(String[] args) {
       
        // List<Integer> numList = Arrays.asList(2, 4,  45, 99, 40, 100, 8, 19, 21, 22);

        // List<Integer> nList;

        // nList = numList.stream().map(n -> n+10).collect(Collectors.toList());
        // System.out.println(nList);

        // List<String> strList = Arrays.asList("One", "Two", "three", "Four", "Five");
        // strList.stream().map(s -> s.toUpperCase()).forEach(System.out::println);

        // List<String> sList;
        // sList = strList.stream().filter(s -> s.contains("o") || s.contains("O")).map(s -> s.toUpperCase()).collect(Collectors.toList());
       
        // System.out.println(sList);

        List<Student> stuList = Arrays.asList(new Student(1, "Sam", "CS1", 3.5),
                                            new Student(2, "Dam", "CS1", 3.7),
                                            new Student(3, "Ham", "PS1", 3.9),
                                            new Student(4, "Dough", "HST", 4.0),
                                            new Student(5, "Marry", "RLG", 3.4),
                                            new Student(6, "Harry", "SRC", 3.2)                                            
                                            );
        

         List<Car> carList = Arrays.asList(new Car(12301, "Nissan", "Altima", "2016", 24.5),
                                    new Car(12302, "Subaru", "Crosstrek", "2018", 25.7),
                                    new Car(12303, "Nissan", "Maxima", "2020", 27.3),
                                    new Car(12304, "Toyota", "Rav4", "2021", 23.5),
                                    new Car(12305, "Subaru", "Outlander", "2021", 22.1),
                                    new Car(12306, "Nissan", "Marino", "2020", 20.5),
                                    new Car(12307, "Honda", "Civic", "2022", 29.5),
                                    new Car(12308, "Honda", "Pilot", "2017", 20.0),
                                    new Car(12309, "Chevy", "Malibu", "2020", 25.5),
                                    new Car(12310, "Ford", "Forester", "2019", 27.5));
    

        List<Student> sList;
        sList = stuList.stream().filter(s -> s.getGrade() >= 3.5).map(s -> s).collect(Collectors.toList());

        for (Student student : sList) {
            System.out.println("Name: " + student.getName() + " - Grade: " + student.getGrade() );
        }

        System.out.println("--------------------------------------------");
        List<Car> cList;

        cList = carList.stream().filter(c -> Integer.parseInt(c.getYear()) >= 2018).collect(Collectors.toList());
        for (Car car : cList) {
            System.out.println("Make: " + car.getMake() + ", Model: " + car.getModel() + ", Year: " + car.getYear());
        }


    }
}
