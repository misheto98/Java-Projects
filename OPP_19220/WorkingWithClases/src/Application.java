import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //with Param
        Dog myFirstDog = new Dog("Sharo",12);

        //default
        Dog mySecondDog=new Dog();// default constructor is Maik
        Dog myThirdDog = new Dog();

        System.out.println("Input the name:");

        String name = input.nextLine();
        myThirdDog.setName(name);

        Dog[]listOfDog ={myFirstDog,mySecondDog,myThirdDog};

        for (Dog tempDog:listOfDog) {

            System.out.println(tempDog);
            tempDog.bark();
        }




    }
}
