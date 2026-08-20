public class StackImplementation {

    public static void main(String[] args) {

        int[] stack = new int[5];
        int top = -1;

        // Push
        top++;
        stack[top] = 10;

        top++;
        stack[top] = 20;

        top++;
        stack[top] = 30;

        // Peek
        System.out.println("Top Element: " + stack[top]);

        // Pop
        System.out.println("Removed: " + stack[top]);
        top--;

        // Display Stack
        System.out.println("Stack Elements:");

        for(int i = top; i >= 0; i--){
            System.out.println(stack[i]);
        }
    }
}