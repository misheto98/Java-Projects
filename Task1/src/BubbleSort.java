import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] myArray;
        Scanner scan = new Scanner(System.in);
        Random myRand = new Random();

        System.out.print("Въведете размерността на масива N :");
        int N = scan.nextInt();

        myArray = new int[N];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myRand.nextInt(100);
        }

        System.out.println("Преди сортиране For" + Arrays.toString(myArray));
        bubSortFor(myArray);
        System.out.println("След сортиране For:" + Arrays.toString(myArray));

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myRand.nextInt(100);
        }

        System.out.println();
        System.out.println("Преди сортиране DO-WHILE:"+ Arrays.toString(myArray));
        bubSortDo(myArray);
        System.out.println("След сортиране DO-WHILE:" + Arrays.toString(myArray));

    }

    public static void bubSortFor(int[] arr){
        int n = arr.length;

        // Сортиране по метода на мехурчето
        for (int i = 0; i < n - 1; i++)         // външен фор-цикъл

        {
            for (int j = 0; j < n - i - 1; j++) // вътрешен фор-цикъл (обърнете внимание на ограничението за j)
            {

                if (arr[j] > arr[j + 1])    // ако левия елемент е по-голям от десния
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];        // temp - временна променлива
                    arr[j]     = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubSortDo(int[] arr){
        int n = arr.length - 1;
        boolean swapped = false;

        do {
            swapped = false;
            n--;

            for (int i = 0; i <= n; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    swapped = true;
                }
            }
        }
        while (swapped);
    }
}
