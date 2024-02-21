import java.lang.reflect.Array;
import java.util.Arrays;

public class GenericStack <T> {

    private Object[] stack;

    public GenericStack() {
        this.stack = new Object[0];
    }

}
