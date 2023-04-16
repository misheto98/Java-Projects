import java.util.Scanner;
public class task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n  ; i++) {
            int currentNumber = scan.nextInt();
            if(currentNumber > max){
                max = currentNumber;
            }
        }

        System.out.println(max);
    }
}
