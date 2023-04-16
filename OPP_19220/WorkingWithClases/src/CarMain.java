import java.util.Scanner;

public class CarMain {
        static int index = 0;
        public static void add(Car[] cars, String brand, String model){
            cars[index] = new Car(brand,model);
            System.out.println("Car was added successfully!");
            Car currentCar = cars[index];
            System.out.println(currentCar);
            index++;
        }
        public static void printArray(Car[] array){
            System.out.println("-----------------------------------");
            for (int i = 0; i < array.length; i++) {
                Car currentCar = array[i];
                if(currentCar != null){
                    System.out.printf(currentCar+" Index of element [%d]\n",i);
                }
            }
            System.out.println("-----------------------------------");
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number of max cars: ");
            int n = Integer.parseInt(scanner.nextLine());

            Car[] cars = new Car[n];
            boolean check=true;
            String command;
            while (check){
                System.out.println("Enter a command: Add or Remove or Print or Exit: ");
                command = scanner.nextLine();
                command = command.toLowerCase();
                if (command.equals("add")){
                    System.out.print("Enter brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter model: ");
                    String model = scanner.nextLine();
                    add(cars, brand, model);
                } if (command.equals("remove")){
                    System.out.println("Enter element index to be removed: ");
                    int indexForRemove = Integer.parseInt(scanner.nextLine());
                    cars[indexForRemove]=null;
                } if (command.equals("print")){
                    printArray(cars);
                } if (command.equals("exit")) {
                    System.out.println("Goodbye!");
                    check = false;
                }

            }
        }
    }




