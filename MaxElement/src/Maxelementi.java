import java.util.Scanner;

public class Maxelementi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Моля, въведете брой елементи вътре в масива");
        int n = sc.nextInt();

        int[] myARR = new int[n];

        for (int i = 1; i < n - 1; i++) {
            System.out.println("Моля, въведете елемент");
            myARR[i] = sc.nextInt();

        }

        int currentMax = myARR[0];

        int currentMAX = 0;
        for (int i = 1; i < n - 1; i++) {
            if (myARR[i] > currentMAX) {
                currentMAX = myARR[i];

            }

        }
        System.out.printf("Най-голямият елемент е : %d", currentMAX);
        System.out.println("Bye bye...");


        
    }
}    