import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class QuickSort{
    public static int[] createArrayForSort(int lenghtOnArray , Random random){
        int[] array = new int[lenghtOnArray];
        for (int i = 0; i < lenghtOnArray; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void QuickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            QuickSort(arr, low, pi - 1);
            QuickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        System.out.println("С колко елемента N да е масива :");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Random myRandom = new Random(100);
        int[] ArrToSort = createArrayForSort(N,myRandom);

        System.out.println("Масива преди сортиране:" );
        Arrays.stream(ArrToSort).forEach(a -> System.out.print(a + ", "));
        System.out.println();

        QuickSort(ArrToSort,0, ArrToSort.length - 1);

        System.out.println("Масива след сортиране:" );
        Arrays.stream(ArrToSort).forEach(a -> System.out.print(a + ", "));
    }
}
