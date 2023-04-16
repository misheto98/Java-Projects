import java.awt.*;

public class Masiv {
    public static void main(String[] args) {
        int[] Array = {2, 3, 3, 4, 5};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < Array.length; i++) {
            int currentElement = Array[i];
            if (min > currentElement) {
                min = currentElement;
            }
        }

        for (int i = 0; i < Array.length; i++) {
            int currentElement1 = Array[i];
            if (max < currentElement1) {
                max = currentElement1;
            }
        }

        double sum = 0;
        for (int i = 0; i < Array.length; i++) {
            sum += Array[i];
        }

        double average = sum / Array.length;

            System.out.println("Най-малкият елемент е : " + min);
            System.out.println("Най-големият елемент е : " + max);
            System.out.println("Сумата е :" + sum);
            System.out.println("Средната стойност е :" + average);

    }
}
