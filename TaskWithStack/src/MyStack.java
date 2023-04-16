import java.util.Stack;

public class MyStack
{
    private String[] stack;
    private int top;
    private int capacity;

    public MyStack(int capacity) {
        this.capacity = capacity;
        this.stack = new String[this.capacity];
        top = -1;
    }

    public boolean IsEmpty() {
        if(top < 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Push(String item) {
        int elements = stack.length - 1;

        if (top >= elements) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            top++;
            stack[top] = item;
            return true;
        }
    }

    public void Clear(){
        this.stack = new String[this.capacity];
        top = -1;
    }

    public String Pop() {
        String element;
        if (IsEmpty()) {
            System.out.println("Empty");
            element = null;
            return element;
        } else {
            element = stack[top];
            top--;
            return element;
        }
    }

    public String Peek() {
        String element;
        if (IsEmpty()) {
            System.out.println("Empty");
            element = null;
            return element;
        } else {
            element = stack[top];
            return element;
        }
    }

    public boolean Searching(String item){
        boolean c = false;
        for (int i = top; i >= 0; i--) {
            String currentElement = stack[i];
            if(item.equals(currentElement)){
                c = true;
                break;
            }
        }
        return c;
    }

    public void Print() {
        if (IsEmpty()) {
            System.out.println("Stack is empty !");
        } else {
            System.out.print("Items: [ ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}