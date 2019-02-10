package homework8;

import java.util.ArrayList;
import java.util.List;

public class StudentComparatorDemo {

    public static void main(String[] args) {
        Student maria = new Student("Maria", "Ivanova", 28, 7.1);
        Student daria = new Student("Daria", "Petrova", 22, 9.3);
        Student olga = new Student("Olga", "Sidorova", 24, 6.0);

        List<Student> students = new ArrayList<>();
        students.add(maria);
        students.add(daria);
        students.add(olga);

        students.sort(new StudentNameComparator().thenComparing(new StudentLastNameComparator()).
                thenComparing(new StudentAgeComparator()
                        .thenComparing(new StudentGpaComparator())));
        System.out.println(students);
    }
}