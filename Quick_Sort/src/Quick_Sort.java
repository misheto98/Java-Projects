import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Quick_Sort {
    public static void main(String[] args) {
        System.out.print("С колко елемента N да е масива :");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Random myRandom = new Random(100);
        int[] ArrToSort = createArrayForSort(N,myRandom);
        System.out.println("Масива преди сортиране:" );
        Arrays.stream(ArrToSort).forEach(a -> System.out.print(a + ", "));

        QuickSort(ArrToSort,0, ArrToSort.length - 1);
        //System.out.println("Масив след сортиране:");
        //Arrays.stream(ArrToSort).forEach(a => System.out.println(a););
        //System.out.print(a+";");;

    }

    public static int[] createArrayForSort(int lenghtOnArray , Random random){
        int[] array = new int[lenghtOnArray];
        for (int i = 0; i < lenghtOnArray; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }


    private static void QuickSort(int[] arrToSort, int low , int high){
        int pi = Partition(arrToSort,low,high);
        QuickSort(arrToSort,low,pi-1);
        QuickSort(arrToSort,pi+1,high);
    }

    private static int Partition(int[] arrToSort,int low, int high){
        int Pivot = arrToSort[high];
        int i = low - 1 ;

        for (int j = low; j < high - 1; j++) {
            if (arrToSort[j]< Pivot ){
                i++;
                 int temp = arrToSort[i];
                 arrToSort[i]= arrToSort[i];
                 arrToSort[j]=temp;
            }

        }
        int temp = arrToSort[i];
        arrToSort[i] = Pivot;
        arrToSort[high] = temp;
        return i + 1 ;
    }
}
