import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        HashMap<String,HashMap<String, ArrayList<Double>>> dic = new HashMap<String,HashMap<String, ArrayList<Double>>>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Do you want information for student (yes/no): ");
            String input = scanner.next();
            System.out.println();

            if (input.equals("no")) {
                break;
            }

            System.out.print("Enter school number: ");
            String number = scanner.next();

            System.out.print("Enter subject: ");
            String subject = scanner.next();

            System.out.print("Enter number grades: ");
            int n = scanner.nextInt();
            ArrayList<Double> listGrades = new ArrayList<Double>();
            for (int i = 0; i < n; i++) {
                int currentGrades = i + 1;
                System.out.print("Enter grade: [" + currentGrades + "] = ");
                listGrades.add(scanner.nextDouble());
            }

            if (!dic.containsKey(number)) {
                HashMap<String, ArrayList<Double>> subjectGrades = new HashMap<String, ArrayList<Double>>();
                subjectGrades.put(subject, listGrades);
                dic.put(number, subjectGrades);
            }else{
                System.out.println("This student is register !");
            }
        }

        dic.entrySet().forEach(entry -> {
            System.out.println("Student number: " + entry.getKey() + " " + entry.getValue());
        });
    }
}
