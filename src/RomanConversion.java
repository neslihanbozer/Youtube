import java.util.HashMap;
import java.util.Stack;

public class RomanConversion {

    HashMap<String, Integer> romanMap;

    public RomanConversion(){
        romanMap = new HashMap<>();
        romanMap.put("I", 1);
        romanMap.put("IV", 4);
        romanMap.put("V", 5);
        romanMap.put("IX", 9);
        romanMap.put("X", 10);
        romanMap.put("XL", 40);
        romanMap.put("L", 50);
        romanMap.put("XC", 90);
        romanMap.put("C", 100);
        romanMap.put("CD", 400);
        romanMap.put("D", 500);
        romanMap.put("CM", 900);
        romanMap.put("M", 1000);
    }

    public int parseToInt(String letter){

        int result = 0;
        char[] array = letter.toCharArray();
        Stack<Character> stack = new Stack<>();

        // If string is null or empty
        if(letter == null || letter.equals("")){
            return  -1;
        }

        // Check for valid strings
        // String that aren't valid roman numbers (for example "IXI" or "MMMM" aren't valid)
        if(!letter.matches("M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$")) {
            return -1;
        }

        for(char c : array){
            if(stack.isEmpty()){
                result += romanMap.get(String.valueOf(c));
                stack.push(c);
            }else{
                char lastElement = stack.peek();
                if(romanMap.containsKey(lastElement + "" + c)){
                    result -= romanMap.get(String.valueOf(lastElement));
                    result += romanMap.get(lastElement + "" + c);
                    stack.push(c);
                } else {
                    result += romanMap.get(String.valueOf(c));
                    stack.push(c);
                }
            }
        }
        return result;
    }
}
