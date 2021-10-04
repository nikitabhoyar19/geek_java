import java.util.Stack;

public class DirectoryStructure {
    public static void main(String[] args) {
       simplifyPath("a/b/c/d/../e/");

    }

    public static void simplifyPath(String str) {

        String arr[] = str.split("/");

        Stack<String> stack = new Stack<>();

        for(int i=0;i<arr.length;i++) {
            if(arr[i].equals("..")) {
                if(stack.empty()) {
                    throw new RuntimeException("Invalid Expression");
                }
                stack.pop();
            }
            else {
                stack.push(arr[i]);
            }
        }

        StringBuffer sb = new StringBuffer();
            while(!stack.isEmpty()) {
                sb.append( "/" + stack.pop());
            }

       sb.reverse();

       System.out.println(sb.toString());
    }
}
