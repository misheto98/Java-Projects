import java.util.Scanner;
public class Zad7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double area = Math.PI * r*r;
        double perimeter = 2*Math.PI*r;
        System.out.println("Area circle is "+ area);
        System.out.println("Perimeter circle is "+ perimeter);

    }
}
