import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindOccurencesofCharInString {

    public int methodForLoop(String str, char c) {

        int count = 0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == c){
                count++;
            }
        }
        return count;
    }

    public int methodRecursion(String str, char c) {

        int index = 0;
        return methodRecursionHelper(str,c,index);
    }

    private int methodRecursionHelper(String str, char c, int index) {

        if(index >= str.length()){
            return 0;
        }

        int count = str.charAt(index) == c ? 1 : 0;
        return count + methodRecursionHelper(str, c, index + 1);
    }

    public int methodRegex(String str, String c) {

        int count = 0;

        Pattern pattern = Pattern.compile(c,Pattern.CASE_INSENSITIVE);

        Matcher m = pattern.matcher(str);

        while(m.find()){
            count++;
        }

        return count;
    }

    public int methodStreamAPI1(String str, char c) {

        long count = str.chars().filter(ch -> ch == c).count();

        return (int) count;
    }

    public int methodStreamAPI2(String str, char c) {

        long count = str.codePoints().filter(ch -> ch == c).count();

        return (int) count;
    }
}
