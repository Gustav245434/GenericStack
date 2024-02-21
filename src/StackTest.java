/**
 * Class for testing GenericStack class
 * @author Gustav Glatzel
 * @version 2024-02-21
 */
public class StackTest {
    /**
     * Main method for testing GenericStack class
     * @param args no usage
     */
    public static void main(String[] args) {

        GenericStack<Integer> stack1 = new GenericStack<>(); // Construct Integer Stack
        stack1.push(1); // Add 3 numbers to the stack
        stack1.push(2);
        stack1.push(3);

        System.out.println("Print out the last added object from the stack: " + stack1.peek()); // Print out the last added object from the stack

        System.out.println("Print out every element from the stack: " + stack1.list()); // Print out every element from the stack

        stack1.pop(); // Remove last 2 added numbers from the stack
        stack1.pop();

        System.out.println("Print out every element from the stack: " + stack1.list()); // Print out every element from the stack

        String[] stringArray = {"Apple", "Banana", "Cucumber"};

        System.out.println("\nStack 2\n");

        GenericStack<String> stack2 = new GenericStack<>(stringArray);

        System.out.println("Print out every element from the stack: " + stack2.list()); // Print out every element from the stack

        stack2.pop(); // Remove the last element

        System.out.println("Print out the last element added to stack: " + stack2.peek()); // Print out the last element added to stack

    }

}
