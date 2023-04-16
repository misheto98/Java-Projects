import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sum in lv:");
        int[] nominals = {50,20,10};
        int sum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < nominals.length; i++) {
            int currentCent = nominals[i];
            if(sum - currentCent >= 0){
                int counter = 0;
                while (sum > 0){
                    sum = sum -currentCent;
                    counter++;
                }
                System.out.println(counter + " nominals count from " + currentCent);
            }
        }
    }
}
