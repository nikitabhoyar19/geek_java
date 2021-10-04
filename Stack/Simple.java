import java.util.Stack;

public class Simple {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        // check empty
        System.out.println(stack.empty());

        // push items
        stack.push("5");
         // check empty
         System.out.println(stack.empty());
        stack.push("nikita");
        stack.push("bhoyar");
        stack.push("7");
        stack.push("7");
        
        // accessing element
        System.out.println(stack);

         // check empty
         System.out.println(stack.empty());

        // pop items
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        // top element
        System.out.println(stack.peek());

        // search element
        System.out.println(stack.search("nikita"));

    }
    
}