import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int currentNumber = scan.nextInt();
            sum = sum + currentNumber;
            //sum += currentNumber
        }

        System.out.println(sum);
    }
}
