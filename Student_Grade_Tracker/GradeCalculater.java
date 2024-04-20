import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GradeCalculater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();

        // Input grades
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter grade for student " + (i + 1) + ":");
            int grade = scanner.nextInt();
            grades.add(grade);
        }

        // Calculate average
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = sum / numStudents;

        // Find highest and lowest grades
        int highest = Collections.max(grades);
        int lowest = Collections.min(grades);

        // Output results
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);

        scanner.close();
    }
}

