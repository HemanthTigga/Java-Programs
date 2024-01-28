import java.util.Scanner;
class StackOverflowException extends Exception {
    public StackOverflowException(String message) {
        super(message);
    }
}

class StackUnderflowException extends Exception {
    public StackUnderflowException(String message) {
        super(message);
    }
}

class Stack {
    private int[] array;
    private int top;
    private int maxSize;

    public Stack(int size) {
        maxSize = size;
        array = new int[maxSize];
        top = -1;
    }

    public void push(int value) throws StackOverflowException {
        if (top == maxSize - 1) {
            throw new StackOverflowException("Stack overflow");
        }
        array[++top] = value;
    }

    public int pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Stack underflow");
        }
        return array[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class stack_array {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter size");
            int n = sc.nextInt();
            Stack stack = new Stack(n);
            while(true)
            {
                int ch = sc.nextInt();
                if(ch == 1)
                {
                    stack.push(sc.nextInt());
                    System.out.println("pushed");
                }
                else if(ch == 2)
                {
                    System.out.println( stack.pop());
                }
                else if(ch == 3)
                {
                    break;
                }
            }
        } 
        catch (StackOverflowException e) {
            System.out.println("Stack Overflow: " + e.getMessage());
        } 
        catch (StackUnderflowException e) {
            System.out.println("Stack Underflow: " + e.getMessage());
        }
    }
}