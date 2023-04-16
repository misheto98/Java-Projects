import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете брой елементи на масива: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] myArray = new int[n];

        //fill on array
        for (int i = 0; i < n; i++) {
            myArray[i] = rand.nextInt(100);
        }

        int[] evenArray = createArrayWithEvenElements(myArray);
        int[] oddArray = createArrayWithOddElements(myArray);

        System.out.println("Начален масив: " + Arrays.toString(myArray));
        System.out.println("Преди сортиране:");
        System.out.println("Масива с четни: " + Arrays.toString(evenArray));
        System.out.println("Масива с не четни: " + Arrays.toString(oddArray));

        System.out.println();

        bubbleSortWithDoAsc(evenArray);
        System.out.println("След сортиране: ");
        System.out.println("Масива с четни елементи по нарастващ ред: " + Arrays.toString(evenArray));
        bubbleSortWithDoDesc(oddArray);
        System.out.println("Масива с не четни елементи в намаляващ ред: " + Arrays.toString(oddArray));
    }

    public static int[] createArrayWithEvenElements(int[] myArray){
        int[] evenArray = new int[getCountEvenElements(myArray)];
        int counterEvenArray = 0;
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i] % 2 == 0){
                evenArray[counterEvenArray] = myArray[i];
                counterEvenArray++;
            }
        }
        return  evenArray;
    }

    public static int[] createArrayWithOddElements(int[] myArray){
        int[] oddArray = new int[getCountOddElements(myArray)];
        int counterOddArray = 0;
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i] % 2 == 1){
                oddArray[counterOddArray] = myArray[i];
                counterOddArray++;
            }
        }
        return  oddArray;
    }

    public static int getCountEvenElements(int[] arr){
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                counter++;
            }
        }

        return counter;
    }

    public static int getCountOddElements(int[] arr){
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 1){
                counter++;
            }
        }

        return counter;
    }

    public static void bubbleSortWithDoAsc(int[] array){
        boolean thereIsBubbling;
        int temp;
        do {
            thereIsBubbling = false;
            for (int i = 0; i < array.length - 1; i++)
            {
                if (array[i] > array[i + 1])
                {
                    thereIsBubbling = true;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        while (thereIsBubbling);
    }

    public static void bubbleSortWithDoDesc(int[] array){
        boolean thereIsBubbling;
        int temp;
        do {
            thereIsBubbling = false;
            for (int i = 0; i < array.length - 1; i++)
            {
                if (array[i] < array[i + 1])
                {
                    thereIsBubbling = true;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        while (thereIsBubbling);
    }
}
