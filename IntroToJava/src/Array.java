import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length on array = ");
        int length = scanner.nextInt();
        int[] arr = new int[length];

        //fill array
        for (int index = 0; index < arr.length; index++) {
            System.out.print("Index: [" + index + "] enter value = ");
            arr[index] = scanner.nextInt();
        }

        //get max element
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currentElement = arr[i];
            if(currentElement > max){
                max = currentElement;
            }
        }

        System.out.println("Max element in array " + max);
    }
}
