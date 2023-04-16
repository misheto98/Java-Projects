
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class RandomSearching {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random myRandom = new Random(100);

        int[] Array = new int[25];
        byte[] Taken = new byte[25];
        int number = 0;
        int count =0;
        int M = 0;
        boolean check = false;

        System.out.println("Въведите търсеното число M");
        M = scan.nextInt();

        for (int i = 0; i < Array.length ; i++) {
            Array[i] = myRandom.nextInt(100);
        }

        while(!check == false)
        {
            number++;
            int i = myRandom.nextInt(25);
            System.out.println("индексът е :" + i) ;

            if (Array[i] == M) {
                System.out.println("Има съвпадение : " +i);
                Taken[i] = 1;
                break;

            }else{
                Taken[i] = 1;
                count = 0;

                for (byte b : Taken) {
                    if (b==1){
                        count++;
                    }

                }
                if(count == 25){
                    check = true;
                    System.out.println("Няма открити");
                }
            }
        }
        System.out.println("Намправени интерации: " + number);
        count = 0;
        for(byte b : Taken){
            if(b == 1){
                count++;
            }
        }
        System.out.println("Брой проверени индекси : " + count);

        //print Array
        for (int i = 0; i < Array.length; i++) {
            System.out.println("index[" + i + "] value: " + Array[i]);
        }

        System.out.println();
        System.out.println();
        //print Taken
        for (int i = 0; i < Taken.length; i++) {
            System.out.println("index[" + i + "] value: " + Array[i]);
        }
        System.out.println();
    }
}
