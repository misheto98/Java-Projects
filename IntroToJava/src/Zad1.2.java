import java.util.Scanner;
public class Zad2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int rows = 0 ; rows < n; rows++){
            for(int cols = 0 ; cols < n ; cols++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
