package filter_method;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
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
        List<Car> cList;

        sList = stuList.stream().filter(s -> s.getGrade()>3.5).collect(Collectors.toList());
        cList = carList.stream().filter(c -> c.getMake().equals("Nissan")).collect(Collectors.toList());


        for (Student stu : sList) {
            System.out.println(stu.getName() + " " + stu.getMajor() + " " + stu.getGrade());
        }

        for (Car car : cList) {
            System.out.println(car.getMake() + " " + car.getModel() + " " + car.getYear());
        }

        
    
    
                                }
                            
        }

