import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = n; i >= 1; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
