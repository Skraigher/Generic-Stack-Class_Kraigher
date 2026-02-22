package s.kraigher;

/**
 * Exception thrown when trying to push onto a full stack.
 */
public class StackFullException extends RuntimeException {
    public StackFullException(String message) {
        super(message);
    }
}
