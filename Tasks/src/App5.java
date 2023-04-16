import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //firstRow
        for (int i = 0; i < n + 1; i++) {
            System.out.print(".");
        }
        for(int i = 0; i < n * 2 + 1; i++){
            System.out.print("_");
        }
        for (int i = 0; i < n + 1; i++) {
            System.out.print(".");
        }
        System.out.println();

        //rows beforeMid();
        int dotBeforeMin = n;
        int lowerDash = n * 2 - 1;
        for (int rows = 0; rows < n; rows++) {
            for (int i = 0; i < dotBeforeMin; i++) {
                System.out.print(".");
            }
            System.out.print("//");
            for (int i = 0; i < lowerDash; i++) {
                System.out.print("_");
            }
            System.out.print("\\\\");
            for (int i = 0; i < dotBeforeMin; i++) {
                System.out.print(".");
            }
            dotBeforeMin--;
            lowerDash+=2;
            System.out.println();
        }

        //mid
        //System.out.println(lowerDash);
        //Mihaela
        System.out.print("//");
        for (int i = 0; i < (lowerDash - 7) / 2; i++) {
            System.out.print("_");
        }
        System.out.print("Mihaela");
        for (int i = 0; i < (lowerDash - 7) / 2; i++) {
            System.out.print("_");
        }
        System.out.print("\\\\");
        System.out.println();

        //rows after mid
        int dotAfterMid = 0;

        for (int rows = 0; rows < n; rows++) {
            for (int i = 0; i < dotAfterMid; i++) {
                System.out.print(".");
            }
            System.out.print("\\\\");
            for (int i = 0; i < lowerDash; i++) {
                System.out.print("_");
            }
            System.out.print("//");
            for (int i = 0; i < dotAfterMid; i++) {
                System.out.print(".");
            }
            System.out.println();
            dotAfterMid++;
            lowerDash-=2;
        }
    }
}

