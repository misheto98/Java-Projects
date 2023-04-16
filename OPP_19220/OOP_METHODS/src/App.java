import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args )throws IOException{
        BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(":::::CALCULATOR::::::");

        System.out.println("Input operand1:");
        float operand1 =Float.parseFloat(myReader.readLine());


        System.out.println("Input operand2:");
        float operand2 =Float.parseFloat(myReader.readLine());
        Calculator myCalculator= new Calculator(operand1,operand2);


        System.out.println("Choose the operations:");
        System.out.println("1.Sum");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiply");
        System.out.println("4.Division");

        String operation = myReader.readLine();
        operation = operation.toLowerCase();

        switch (operation){
            case "sum":
                System.out.println(operand1 + "+" + operand2 + "=" + myCalculator.sum());
                break;

            case "subtraction":
                System.out.println(operand1 + "-" + operand2 + "=" + myCalculator.subtraction());
                break;

            case "multiply":
                System.out.println(operand1 + "*" + operand2 + "=" + myCalculator.multiply());
                break;

            case "division":
                System.out.println(operand1 + "/" + operand2 + "=" + myCalculator.div());
                break;

            default:
                System.out.println("Please enter another operation.This operation doesn't exist!");
                break;

        }

    }
}
