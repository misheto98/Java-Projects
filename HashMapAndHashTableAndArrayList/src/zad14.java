import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {
        double n;
        double sum = 0;
        double grades[] = new double[5];
        System.out.println("Въведете оценки:");
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < grades.length; i++) {
            do {
                n = scan.nextDouble();

            }while(n<2 || n>6);
            grades[i]= n ;
            sum+=grades[i];
            System.out.println("Оценката е : "+ grades[i]);
        }
        System.out.println("Средният успех е :" + (sum/5));

    }
}


