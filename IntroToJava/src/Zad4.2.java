import java.util.Scanner;
public class Zad4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int rows = n ; rows >= 1 ; rows--){
            for(int cols = 0 ; cols < rows ; rows++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
