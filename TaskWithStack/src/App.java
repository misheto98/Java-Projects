import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        MyStack stack = new MyStack(10);

        stack.Push("Ivan");
        stack.Push("Pesho");
        stack.Push("Gosho");

        System.out.println(stack.Searching("Ivan"));
        System.out.println(stack.IsEmpty());
        System.out.println(stack.Peek());

        stack.Print();
        stack.Pop();
        stack.Print();
        stack.Clear();
        stack.Print();
    }
}
