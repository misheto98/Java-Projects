import java.util.Scanner;
import java.util.ArrayList;


public class zad1 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int n1 = Input.nextInt();
        ArrayList<Integer> number = new ArrayList<Integer>(n1);
        for (int i = 0; i < n1; i++) {
            int nub = Input.nextInt();
            number.add(nub);
        }
    }
}
