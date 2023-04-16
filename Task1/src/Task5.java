import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;

        for (int i = 0; i < n  ; i++) {
            int currentNumber = scan.nextInt();
            sum+=currentNumber;
        }
        System.out.print(sum);

    }

   }

