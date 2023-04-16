import java.util.Scanner;
public class zad23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int score = 0;
        if (n > 4) {
            score = n;
        }
        //Top
        System.out.print("/");
        for (int i = 0; i < n / 2; i++) {
            System.out.print("^");
        }
        System.out.print("\\");
        for (int i = 0; i < score / 2; i++) {
            System.out.print("_");
        }
        System.out.print("/");
        for (int i = 0; i < n / 2; i++) {
            System.out.print("^");
        }
        System.out.print("\\");
        System.out.println();
        //Mid
        for (int i = 0; i < n - 3; i++) {
            System.out.print("|");
            for (int j = 0; j < n * 2 - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.print("|");
        for (int i = 0; i < n / 2 + 1; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < n / 2; i++) {
            System.out.print("_");
        }
        for (int i = 0; i < n / 2 + 1; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println();
        //BOT
        System.out.print("\\");
        for (int i = 0; i < n / 2; i++) {
            System.out.print("_");
        }
        System.out.print("/");
        for (int i = 0; i < score / 2; i++) {
            System.out.print(" ");
        }
        System.out.print("\\");
        for (int i = 0; i < n/2; i++) {
            System.out.print("_");
        }
        System.out.print("/");
    }
}
