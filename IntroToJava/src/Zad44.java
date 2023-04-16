import java.util.Scanner;
public class Zad44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        String firstAddLastRow = "*";
        for (int col = 0; col < n-2 ; col++) {
            firstAddLastRow +=" -";
        }
        firstAddLastRow += " *";
        System.out.println(firstAddLastRow);

        String middleRow = "|";
        for (int col = 0; col < n-2; col++) {
            middleRow += " -";
        }
        middleRow+=" |";

        for (int i = 0; i < n-2; i++) {
            System.out.println(middleRow);
        }
        System.out.println(firstAddLastRow);



    }
}
