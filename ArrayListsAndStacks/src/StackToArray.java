
    import java.util.Stack;
    import java.util.Stack;
    public class StackToArray {
        public static void main(String[] args) {
            Stack<Integer> s = new Stack<Integer>();
            s.push(10);
            s.push(20);
            s.push(30);

            System.out.println("Elements in stack: " + s);

            Object[] arr = s.toArray();
            System.out.println("Elements in Array: ");
            for(int i=0;i<arr.length;i++)
                System.out.print(arr[i] + " ");
        }
    }
