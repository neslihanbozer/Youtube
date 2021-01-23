import java.util.Stack;

public class BalancedParentheses {

    public static boolean findBrackets(String s){
        Stack<Character> stack = new Stack<>();
        char[] bracket = s.toCharArray();

        for(char c : bracket){

            char rev = getReverseBracket(c);
            if(isLeftBracket(c)){
                stack.push(c);
            } else if( stack.isEmpty() || stack.pop() != rev){
                return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean isLeftBracket(char bracket) {
        if(bracket == '(' || bracket == '[' || bracket == '{'){
            return true;
        }
        return false;
    }

    private static char getReverseBracket(char bracket) {

        String allBrackets = "{([})]";
        int index = allBrackets.indexOf(bracket);
        index = (index + 3) % 6;

        return allBrackets.toCharArray()[index];
    }
}
