
    import javax.tools.Diagnostic;
import java.util.*;

    public class App1 {
        public static void main(String[] args) {
            //създаваме листа
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> list = new ArrayList();

            //пълним листа със случайни числа
            System.out.println("Моля въведете брой лементи на листа: ");
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                Random random = new Random();
                list.add(random.nextInt(50));
            }

            System.out.println(list);
        }
    }


