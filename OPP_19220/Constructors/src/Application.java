import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number of student:");
        int number = scan.nextInt();
        int count = number;
        ArrayList<Student> courseOfStudents = new ArrayList<>();

        while (count > 0) {
            System.out.printf("Enter the info of %d", (number - count + 1));
            System.out.println("-----------");
            System.out.println();
            System.out.println("Input the firstName:");
            String firstName = scan.next();
            System.out.println("Input the lastName");
            String lastName = scan.next();
            System.out.println("Input the courseNumber:");
            int  courseNumber = scan.nextInt();

        Student tempStudent = new Student(firstName, lastName,courseNumber);
        courseOfStudents.add(tempStudent);
        tempStudent = null;
        count--;
    }

        System.out.println();
        System.out.println("Info about every students:");

        for (Student tempStudent :courseOfStudents
             ) {
            System.out.println(tempStudent);

        }
    }
}