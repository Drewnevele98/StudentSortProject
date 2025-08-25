package studentsort;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[10];

        students[0] = new Student(5, "Kevin", "New York");
        students[1] = new Student(1, "Devin", "Los Angeles");
        students[2] = new Student(9, "Jackson", "Chicago");
        students[3] = new Student(2, "Andrew", "Houston");
        students[4] = new Student(8, "Savannah", "Miami");
        students[5] = new Student(3, "Christina", "Boston");
        students[6] = new Student(6, "Adrianna", "Seattle");
        students[7] = new Student(10, "Colin", "San Diego");
        students[8] = new Student(4, "Santosh", "Denver");
        students[9] = new Student(7, "Judy", "Dallas");

        System.out.println("Before Sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sorting using Arrays.sort + Comparator
        Arrays.sort(students, new RollnoComparator());

        System.out.println("\nAfter Sorting by Roll Number:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

