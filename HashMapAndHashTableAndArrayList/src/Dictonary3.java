import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.List;


public class Dictonary3 {
    public static void main(String[] args) {

        int average = 0;

        int[] MyArray = new Random() .ints().toArray();
        List<Integer> MyList01 = Arrays.stream(MyArray).boxed().toList();

        System.out.println(MyArray);
        System.out.println("Целия списък:");
        System.out.println("Всички нечетни числа:");
        MyList01.forEach(tmp->
                {
                    if(tmp %2 ==0){
                        System.out.println(tmp);
                    }
                }
                );





        }
    }
