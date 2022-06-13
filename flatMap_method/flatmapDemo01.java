package flatMap_method;

import filter_method.Student;
import java.util.*;

public class flatmapDemo01 {
    public static void main(String[] args) {
        List<Student> stuList = Arrays.asList(new Student(1, "Sam", "CS1", 3.5),
                new Student(2, "Dam", "CS1", 3.7),
                new Student(3, "Ham", "PS1", 3.9),
                new Student(4, "Dough", "HST", 4.0),
                new Student(5, "Marry", "RLG", 3.4),
                new Student(6, "Harry", "SRC", 3.2));

        List<Student> stuList1 = Arrays.asList(new Student(7, "Lee", "CS1", 3.5),
                new Student(8, "Ben", "CS1", 3.7),
                new Student(9, "Dan", "PS1", 3.1),
                new Student(10, "Roy", "HST", 3.0),
                new Student(11, "Maggie", "RLG", 3.4),
                new Student(12, "Moore", "SRC", 2.9));

      //  List<List<Student>> stu2dList = new ArrayList<>(); //Arrays.asList(stuList, stuList1)
      List<List<Student>> stu2dList = Arrays.asList(stuList, stuList1);
        // stu2dList.add(stuList);
        // stu2dList.add(stuList1);

        stu2dList.stream().flatMap(s -> s.stream()).filter(s -> s.getGrade() >= 3.2).forEach(s -> System.out.println(s.getName()));


        

    }
}
