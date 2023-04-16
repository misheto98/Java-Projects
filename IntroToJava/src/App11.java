import java.util.Scanner;
public class App11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstname = scan.nextLine();
        String lastname = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String town = scan.nextLine();

        System.out.printf("You are %s %s , a %d-years old person from %s.", firstname,lastname,age,town);
    }
}
