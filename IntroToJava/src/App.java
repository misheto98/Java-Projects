import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner pesho = new Scanner(System.in);
        System.out.print("Enter number one: ");
        //int n1 = pesho.nextInt();
        double n1 = pesho.nextDouble();
        System.out.println("Enter number two");
        double n2 = pesho.nextDouble();

        double sum = n1 + n2;
        System.out.println("Result: " + sum);
    }
}
