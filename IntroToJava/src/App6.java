import java.util.Scanner;
public class App6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double h = scan.nextDouble();
        double area = ((a + b) * h ) / 2;
        System.out.println(area);
    }
}
