import java.util.Scanner;

public class Zadddd5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int lowDash = 0;
        if(n > 4){
            lowDash = n /2;
        }

        System.out.print("/");
        for (int i = 0; i < n /2; i++) {
            System.out.print("^");
        }
        System.out.print("\\");

        for (int i = 0; i < lowDash; i++) {
            System.out.print("_");
        }

        System.out.print("/");
        for (int i = 0; i < n /2; i++) {
            System.out.print("^");
        }
        System.out.print("\\");
        System.out.println();

        for (int rows = 0; rows < n - 2; rows++) {
            System.out.print("|");
            for (int i = 0; i < n * 2 - 2 ; i++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }

        System.out.print("\\");
        for (int i = 0; i < n /2; i++) {
            System.out.print("_");
        }
        System.out.print("/");

        for (int i = 0; i < lowDash; i++) {
            System.out.print(" ");
        }

        System.out.print("\\");
        for (int i = 0; i < n /2; i++) {
            System.out.print("_");
        }
        System.out.print("/");
        System.out.println();

    }
}




