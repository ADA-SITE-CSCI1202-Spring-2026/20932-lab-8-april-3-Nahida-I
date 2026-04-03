import java.util.*;

public class Grades {
    public static void main(String[] args) {

    
        Map<String, Double> students = new HashMap<>();

        
        students.put("Zeynab", 4.0);
        students.put("Fidan", 3.8);
        students.put("Nahida", 4.0);
        students.put("Jack", 3.2);
        

        double maxGPA = Collections.max(students.values());

        System.out.println("Highest GPA: " + maxGPA);
        System.out.println("Student with highest GPA:");

        for (Map.Entry<String, Double> entry : students.entrySet()) {
            if (entry.getValue() == maxGPA) {
                System.out.println(entry.getKey());
            }
        }

        double sum = 0;

        for (double gpa : students.values()) {
            sum += gpa;
        }

        double average = sum / students.size();

        System.out.println("Average GPA: " + average);

                int count = 0;

        for (double gpa : students.values()) {
            if (gpa < average) {
                count++;
            }
        }

        System.out.println("Number of students below average: " + count);
    }
}


    




