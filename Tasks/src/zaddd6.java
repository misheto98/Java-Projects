import java.util.Scanner;

public class zaddd6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        //first row
        System.out.print("+ ");
        for (int i = 0; i < n - 2; i++) {
            System.out.print("- ");
        }
        System.out.print("+");
        System.out.println();

        //mid

        for (int rows = 0; rows < n - 2; rows++) {
            System.out.print("| ");
            for (int i = 0; i < n - 2; i++) {
                System.out.print("- ");
            }
            System.out.print("|");
            System.out.println();
        }

        System.out.print("+ ");
        for (int i = 0; i < n - 2; i++) {
            System.out.print("- ");
        }
        System.out.print("+");
        System.out.println();
    }
}
