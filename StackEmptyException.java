package s.kraigher;

/**
 * Exception thrown when trying to pop or peek from an empty stack.
 */
public class StackEmptyException extends RuntimeException {
    public StackEmptyException(String message) {
        super(message);
    }
}
