import java.util.Random;
import java.util.Scanner;

class BinarySearchExample{
    public static void main(String args[]){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(1001);
        int userNumber = Integer.parseInt(scanner.nextLine());
        while (true){
            if(userNumber == randomNumber){
                System.out.println("ПОЗНАХТЕ");
                break;
            }
            if (userNumber < randomNumber){
                System.out.println("НАГОРЕ");
            } else{
                System.out.println("НАДОЛУ");
            }
            userNumber = Integer.parseInt(scanner.nextLine());
        }
    }
}