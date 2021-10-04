import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        System.out.println(check(" "));
    }

    public static boolean check(String string) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<string.length();i++) {
            if(string.charAt(i) == '{') {
                stack.push(string.charAt(i));
            }
            else {
                if(stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        if(!stack.isEmpty()) {
            return false;
        }

        return true;
    }
}
