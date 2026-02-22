package s.kraigher;

/**
 * Test class for GenericStack.
 * Demonstrates both Integer and String stacks.
 */
public class TestClass {
    public static void main(String[] args) {
        GenericStack<Integer> numberStack = new GenericStack<>(5);
        System.out.println("Number Stack Test:");
        try {
            numberStack.push(10);
            numberStack.push(20);
            numberStack.push(30);

            System.out.println("Peek: " + numberStack.peek());
            System.out.println("List: " + numberStack.list());

            System.out.println("Pop: " + numberStack.pop());
            System.out.println("List after pop: " + numberStack.list());

        } catch (StackFullException | StackEmptyException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- Text Stack ---");
        GenericStack<String> textStack = new GenericStack<>(5);
        try {
            textStack.push("Hello");
            textStack.push("World");
            textStack.push("Java");

            System.out.println("Peek: " + textStack.peek());
            System.out.println("List: " + textStack.list());

            System.out.println("Pop: " + textStack.pop());
            System.out.println("List after pop: " + textStack.list());

        } catch (StackFullException | StackEmptyException e) {
            System.out.println(e.getMessage());
        }

        // Test popping from empty stack
        try {
            GenericStack<Double> emptyStack = new GenericStack<>(2);
            emptyStack.pop(); // should throw StackEmptyException
        } catch (StackEmptyException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        } catch (StackFullException e) {
            System.out.println(e.getMessage());
        }
    }
}