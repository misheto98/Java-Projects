import java.util.Scanner;

public class Zadd8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = n; i < 0 ; i++) {
            System.out.print("*");

            for (int j = 0; j < n; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
