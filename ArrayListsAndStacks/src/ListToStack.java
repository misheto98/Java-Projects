
    import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
    public class ListToStack {
        public static void main(String[] args) {
            Stack<Integer> s = new Stack<Integer>();
            List<Integer> l = new ArrayList<Integer>();

            l.add(10);
            l.add(20);
            l.add(30);
            l.add(40);
            l.add(50);
            l.add(60);
            l.add(70);
            l.add(80);

            s.addAll(l);
            System.out.println("Elements in stack from List: " + s);
        }
    }

