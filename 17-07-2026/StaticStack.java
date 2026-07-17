class StaticStack {
    int[] stack;
    int top;
    int capacity;

    public StaticStack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int val) {
        if (isFull()) {
            System.out.println("Stack OverFlow");
            return;
        }
        stack[++top] = val;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack UnderFlow");
            return -1;
        }
        return stack[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}

public class Main {
    public static void main(String[] args) {
        StaticStack s = new StaticStack(5);

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop()); // 20
        System.out.println(s.pop()); // 10
        System.out.println(s.pop());
    }
}
