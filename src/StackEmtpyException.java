/**
 * StackEmptyException class is there to give back a better exception when the stack in GenericStack class is empty
 * @author Gustav Glatzel
 * @version 2024-02-21
 */
public class StackEmtpyException extends RuntimeException {
    /**
     * Creates a new exception with a basic message. Message: "Stack can not be empty!"
     */
    public StackEmtpyException() {
        super("Stack can not be empty!");
    }

}
