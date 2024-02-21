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

}
