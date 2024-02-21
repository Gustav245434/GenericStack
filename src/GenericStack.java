import java.util.Arrays;

/**
 * Generic Stack class for creating a stack with a variable datatype.
 * @param <T> The datatype that the stack uses.
 */
public class GenericStack <T> {

    private Object[] stack;

    /**
     * Creates an empty stack
     */
    public GenericStack() {
        this.stack = new Object[0];
    }

    /**
     * Creates a stack that is filled with the elements that are given over the parameter
     * @param stack The objects the empty stack is filled with
     */
    public GenericStack(T[] stack) {

        if(stack == null) throw new StackEmtpyException();

        for (Object object : stack) {
            if(object == null) throw new NullPointerException("No object in the stack parameter can be null!");
        }
        this.stack = stack;

    }

    /**
     * Adds an elements to the stack
     * @param object The elements that is added to the stack
     */
    public void push(T object) {
        Object[] newStack = Arrays.copyOf(this.stack, this.stack.length + 1);
        newStack[newStack.length - 1] = object;
        this.stack = newStack;
    }

    /**
     * Returns the last element added to the stack
     * @return The element that was added at last
     */
    public T peek() {

        if (this.stack.length == 0) {
            throw new StackEmtpyException();
        }

        return (T) this.stack[this.stack.length - 1];
    }

    /**
     * Removes the last added element from the stack
     * @return The last added element before removal
     */
    public T pop() {

        if (this.stack.length == 0) {
            throw new StackEmtpyException();
        }

        T object = (T) this.stack[this.stack.length - 1];

        this.stack = Arrays.copyOf(this.stack, this.stack.length - 1);
        return object;
    }

    /**
     * Gives back a list of all elements in the stack. Seperated by ";"
     * @return The list of all elements in the stack. Seperated by ";"
     */
    public String list() {

        StringBuilder returnee = new StringBuilder();

        for (Object o : this.stack) {
            T typeObject = (T) o;
            returnee.append(typeObject.toString()).append(";");
        }

        return returnee.toString();
    }

}
