package s.kraigher;

/**
 * A simple generic stack class.
 * Uses an Object array internally because generic arrays are not allowed.
 * Demonstrates basic stack operations: push, pop, peek, and list.
 */
public class GenericStack<T> {
    private T[] items; // Array to store stack elements
    private int top;   // Index of the next empty spot
    private int size;  // Maximum capacity of the stack

    // Default constructor, stack with size 10
    public GenericStack() {
        this.size = 10;
        this.items = (T[]) new Object[size]; // cast Object[] to T[]
        this.top = 0; // initially empty
    }

    // Constructor with custom size
    public GenericStack(int size) {
        this.size = size;
        this.items = (T[]) new Object[size];
        this.top = 0;
    }

    // Push an item onto the stack
    public void push(T item) throws StackFullException {
        if (this.top == this.size) {
            throw new StackFullException("Stack is full");
        }
        items[top] = item;
        top++;
    }

    // Pop the top item from the stack
    public T pop() throws StackEmptyException {
        if (top == 0) {
            throw new StackEmptyException("Stack is empty");
        }
        top--;
        return items[top];
    }

    // Peek at the top item without removing it
    public T peek() throws StackEmptyException {
        if (top == 0) {
            throw new StackEmptyException("Stack is empty");
        }
        return items[top - 1];
    }

    // List all elements in the stack as a string separated by ;
    public String list() {
        String list = "";
        for (int i = 0; i < top; i++) {
            if (i > 0) list += ";";
            list += items[i];
        }
        return list;
    }
}
