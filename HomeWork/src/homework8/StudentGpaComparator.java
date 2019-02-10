package homework8;

import java.util.Comparator;

public class StudentGpaComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare(student1.getGpa(), student2.getGpa());
    }
}