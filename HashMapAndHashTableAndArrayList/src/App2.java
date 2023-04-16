import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App2 {
    public static void main(String[] args) {
        Hashtable<String,String> Catalog = new Hashtable<>();
        Catalog.put("Money For Nothing", "Dire Straits");
        Catalog.put("Brothers In Arms", "Dire Straits");
        Catalog.put("Your Latest Trick", "Dire Straits");
        Catalog.put("Walk Of Life", "Dire Straits");
        Catalog.put("Why Worry", "Dire Straits");
        Catalog.put("Urgent", "Foreigner");
        Catalog.put("Snowman", "Foreigner");
        Catalog.put("I Want To Know", "Foreigner");
        Catalog.put("The Wall", "Pink Floyd");
        Catalog.put("Shine On You Crazy Diamond", "Pink Floyd");
        Catalog.put("Wish You Were Here", "Pink Floyd");
        Catalog.put("Time", "Pink Floyd");

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        while (!input.equals("end")){

            if(Catalog.containsKey(input)){
                System.out.println("Song: " + input + " Group: " + Catalog.get(input));
            }

            if(Catalog.containsValue(input)){

                for (Map.Entry<String, String> entry : Catalog.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();

                    if(value.equals(input)){
                        System.out.println ("Group: " + value + " Song: " + key);
                    }
                }
            }

            input = scan.nextLine();
        }
    }
}
