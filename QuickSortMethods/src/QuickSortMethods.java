import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

    public class QuickSortMethods {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Въведете броят на елементите в масива: ");
            int n = scanner.nextInt();
            int[] array = createArray(n);
            System.out.println("Преди сортиране: ");
            System.out.println(Arrays.toString(array));
            quickSort(array,0,n -1);
            System.out.println("След сортиране: ");
            System.out.println(Arrays.toString(array));

        }

        public static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public static int partition(int[] arr, int low, int high) {
            int pivot = arr[high];
            int i = (low - 1);

            for(int j = low; j <= high - 1; j++) {
                if (arr[j] < pivot) {
                    i++;
                    swap(arr, i, j);
                }
            }

            swap(arr, i + 1, high);
            return (i + 1);
        }

        public static void quickSort(int[] arr, int low, int high) {
            if (low < high) {
                int pi = partition(arr, low, high);
                quickSort(arr, low, pi - 1);
                quickSort(arr, pi + 1, high);
            }
        }

        public static int[] createArray(int n){
            Random random = new Random();
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100);
            }
            return array;
        }
    }


