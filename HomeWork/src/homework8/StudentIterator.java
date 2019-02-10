package homework8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentIterator {

    public static void main(String[] args) {
        Student maria = new Student("Maria", "Ivanova", 18, 7.1);
        Student daria = new Student("Daria", "Petrova", 22, 9.3);
        Student olga = new Student("Olga", "Sidorova", 24, 6.0);

        List<Student> students = new ArrayList<>();
        students.add(maria);
        students.add(daria);
        students.add(olga);

        System.out.println(getBestStudent(students).getFirstName());
    }

    public static Student getBestStudent(List<Student> students) {
        Student result = students.get(0);
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student current = iterator.next();
            if (current.getGpa() > result.getGpa()) {
                result = current;
            }
        }
        return result;
    }
}