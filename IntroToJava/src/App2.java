import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.print("Enter side on square = ");
        double side = scan.nextDouble();
        double area = side * side;
        System.out.println("Area " + area + " !");
        System.out.printf("Area %.2f !",area);
    }
}
