import java.util.Stack;
public class Balanced {
    public static void main(String[] args) {
        String[] str = {"({[]})","({[})", "((()))", "({)}"};
        for(String s: str)
         System.out.println(isBalanced(s));
        
    }
    public static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }else if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }else{
                return false;
            }
        }
        if(stack.isEmpty()){
            return true;
        }

        //
        
        return false;
}
        
    
}
