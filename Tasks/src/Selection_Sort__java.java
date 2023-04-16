import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Selection_Sort__java {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Random myRandom = new Random();

            System.out.print("Input number of element:");
            int N = scan.nextInt();
            int[] MyArray = new int[N];
            for (int i = 0; i < MyArray.length; i++) {
                MyArray[i] = myRandom.nextInt(100);

            }
            System.out.print("Elements before insertion Sort:");
            System.out.println(Arrays.toString(MyArray));

            InSelection(MyArray);
            System.out.print("Elements after insertion Sort:");
            System.out.println(Arrays.toString(MyArray));
        }

        public static void InSelection(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n-1; i++)
            {
                int min_idx = i;
                for (int j = i+1; j < n; j++){
                    if (arr[j] < arr[min_idx]){
                        min_idx = j;
                    }
                }

                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
    }


