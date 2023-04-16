import jdk.swing.interop.SwingInterOpUtils;

import java.awt.datatransfer.StringSelection;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Selection_Sort_ {
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
        int IndexOfMin;
        int i,j;

        for (i = 0; i < arr.length; i++) {
            IndexOfMin = i;

            for (j = 0; j < arr.length; j++) {
                if(arr[j] < arr[i]){
                    IndexOfMin = j;
                }
            }

            int Buffer = arr[i];
            arr[i] = arr[IndexOfMin];
            arr[IndexOfMin] = Buffer;

        }
    }
}
