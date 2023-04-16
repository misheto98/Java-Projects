import java.util.Hashtable;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args)
    {
        Hashtable<Integer, String> my_dict = new Hashtable<>();
        my_dict.put(1,"January");
        my_dict.put(2, "February");
        my_dict.put(3, "March");
        my_dict.put(4, "April");
        my_dict.put(5, "May");
        my_dict.put(6, "June");
        my_dict.put(7, "July");
        my_dict.put(8, "August");
        my_dict.put(9, "September");
        my_dict.put(10, "October");
        my_dict.put(11, "November ");
        my_dict.put(12, "December");

        Hashtable<String, Integer> my_dict2 = new Hashtable<>();
        my_dict2.put("January",1);
        my_dict2.put("February",2);
        my_dict2.put("March",3);
        my_dict2.put("April",4);
        my_dict2.put("May",5);
        my_dict2.put("June",6);
        my_dict2.put("July",7);
        my_dict2.put("August",8);
        my_dict2.put("September",9);
        my_dict2.put("October",10);
        my_dict2.put("November ",11);
        my_dict2.put("December",12);


        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        while (!input.equals("end")){
            Pattern pattern = Pattern.compile("^\\d+$", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(input);
            boolean matchFound = matcher.find();
            if(matchFound) {
                int parseInput = Integer.parseInt(input);
                if(my_dict.containsKey(parseInput)){
                    System.out.println("Value at key = " +  parseInput + " : " + my_dict.get(parseInput));
                }else {
                    System.out.println("Key not valid !");
                }
            } else {
                if(my_dict2.containsKey(input)){
                    System.out.println("Value at key = " +  input + " : " + my_dict2.get(input));
                }else {
                    System.out.println("Key not valid !");
                }
            }

            input = scan.nextLine();

        }
    }
}
