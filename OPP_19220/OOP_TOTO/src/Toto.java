import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Toto {
    static int[] totoNumbers;
    static int[] myNumbers;
    static int counter = 0;

    public static void main(String[] args) {
        System.out.println(":::::PLAY TOTO 6/49:::::");
        Scanner scan = new Scanner(System.in);
        totoNumbers = new Random().ints(6, 1, 50).toArray();
        myNumbers = new int[6];


        //TOTO ELEMENTS:
        System.out.println();
        System.out.println("TOTO elements BEFORE random input:");
        Arrays.stream(totoNumbers).forEach(current -> System.out.print(current + " | "));
        System.out.println();

        //MY NUMBERS INPUT:
        System.out.println();
        System.out.println("My numbers BEFORE input: ");
        Arrays.stream(myNumbers).forEach(current -> System.out.print(current + " | "));
        System.out.println();


        //ARRAY GENERATE RANDOM NUMBERS and checks duplicate numbers
        for (int i = 0; i < totoNumbers.length; i++) {
            int rndTOTONumber = new Random().nextInt(1, 50);
            while (isDuplicatedTOTO(rndTOTONumber)) // Проверка дали се повтаря
            {
                rndTOTONumber = new Random().nextInt(1, 50);
            }
            totoNumbers[i] = rndTOTONumber;
        }
        System.out.println();

        //My numbers and  checks duplicate  numbers

        for (int i = 0; i < myNumbers.length; i++) {

            System.out.println("Input your " + (i + 1) + " number :");
            int myInputNumber = scan.nextInt();
            while (isDuplicatedMY(myInputNumber) || myInputNumber < 0 || myInputNumber > 49) // Проверка дали се повтаря
            {
                System.out.println("Input your " + (i + 1) + " number :");
                myInputNumber = scan.nextInt();
            }
            myNumbers[i] = myInputNumber;



        }
        System.out.println();
        System.out.println("TOTO elements AFTER random input:");
        Arrays.stream(totoNumbers).forEach(current -> System.out.print(current + " | "));
        System.out.println();

        System.out.println();
        System.out.println("My numbers AFTER input: ");
        Arrays.stream(myNumbers).forEach(current -> System.out.print(current + " | "));
        System.out.println();


    }

    public static boolean isDuplicatedTOTO(int myInputNumber) {
        boolean duplicated = false;
        for (int current : myNumbers) {
            if (current == myInputNumber) {
                duplicated = true;
                break;
            }
        }
        return duplicated;
    }

    public static boolean isDuplicatedMY(int rndTOTONumber){
        boolean duplicated = false;

        for (int current : totoNumbers) {
            if (current == rndTOTONumber) {
                duplicated = true;
                break;
            }
        }
        return duplicated;
    }

    public static  void checkForWins() {
        counter = 0;
        for (int current1 : myNumbers) {
            for (int current2 : totoNumbers) {
                if (current1 == current2) {
                    counter++;
                }
            }
                System.out.println();
                System.out.println("Numbers wins is :" + counter);
                System.out.println();

                switch (counter) {
                    case 0, 1, 2:
                        System.out.println("TRY AGAIN!YOU ARE NOT LUCKY TODAY");
                        break;
                    case 3:
                        System.out.println("YOU GUESSED THREE");
                        break;
                    case 4:
                        System.out.println("YOU GUESSED FOUR");
                        break;
                    case 5:
                        System.out.println("YOU GUESSED FIVE");
                        break;
                    case 6:
                        System.out.println("YOU GUESSED SIX");
                        break;

                }

            }

        }
    }










