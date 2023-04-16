import java.util.Scanner;
public class Zad3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int abc = scan.nextInt();

        for(int rows = 1 ; abc <= rows ; rows++){
            for(int cols = 0 ; cols < rows ; cols++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
