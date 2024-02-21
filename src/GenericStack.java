import java.lang.reflect.Array;
import java.util.Arrays;

public class GenericStack <T> {

    private Object[] stack;

    public GenericStack() {
        this.stack = new Object[0];
    }

    public GenericStack(Object[] stack) {

        if(stack == null) throw new IllegalArgumentException("Stack parameter cant be null!"); // Change to StackEmptyException

        for (Object object : stack) {
            if(object == null) throw new NullPointerException("No object in the stack parameter can be null!");
        }
        this.stack = stack;

    }

    public void push(T object) {
        Object[] newStack = Arrays.copyOf(this.stack, this.stack.length + 1);
        newStack[newStack.length - 1] = object;
        this.stack = newStack;
    }

    public T peek() {

        if (this.stack.length == 0) {
            throw new IllegalArgumentException(); // -||-
        }

        return (T) this.stack[this.stack.length - 1];
    }

    public void pop() {

        if (this.stack.length == 0) {
            throw new IllegalArgumentException(); // -||-
        }

        this.stack = Arrays.copyOf(this.stack, this.stack.length - 1);
    }

    public String list() {

        StringBuilder returnee = new StringBuilder();

        for (Object o : this.stack) {
            T typeObject = (T) o;
            returnee.append(typeObject.toString()).append(";");
        }

        return returnee.toString();
    }

}
