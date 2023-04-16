
import java.util.Arrays;
import java.util.Scanner;

public class Arrray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Моля въведете брой на масивите:");
        int n = scan.nextInt();
        for (int i = 0; i < arr.le; i++) {
            System.out.printf("Моля въведете число ");
            arr[i] = scan.nextInt();

        }
        System.out.println("Преди сортиране "+ Arrays.toString(arr));
        sortArrays(arr);
        System.out.println("След сортиране "+ Arrays.toString(arr));
        System.out.println("Моля въведете брой на масивите:");
        int p = scan.nextInt();
        int [] b = new int[p];
        for (int i = 0; i < b.length; i++) {
            System.out.printf("Моля въведете число ");
            b [i]= scan.nextInt();
        }
        System.out.println("Проверка"+Arrays.toString(b));
        System.out.println("Преди сортиране:"+Arrays.toString(b));
        sortArrays(b);
        System.out.println("След сортиране:"+Arrays.toString(b));
        System.out.println("Проверяваме дали масив 1 е равен на масив 2");
        System.out.println("Ако това е вярно ще получите да ,но ако е грешно ще получите отговор Не");
        if (arr.lenght == b.length){
            System.out.println("Да");
        }
         class staredArraysFromBiggerToLower{
             public static void sortArrays(int[]arr) {
                 int e;
                 for (int i = 0; i < arr.length ; i++) {
                     for (int j = 0; j < arr.length; j++) {
                         if (arr[j] < arr[j+1]){
                             e = arr[j];
                             arr[j] = arr[j+1];
                             arr[j+1]=e;
                         }
                         
                     }
                     
                 }
             }
        }

    }
}
