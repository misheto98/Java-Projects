import java.util.Scanner;

public class Zzad8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int rows = 1; rows < n ; rows++) {
            System.out.print("$");

            for (int cols = 1; cols <rows ; cols++) {
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
