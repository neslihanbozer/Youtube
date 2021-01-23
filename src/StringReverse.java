public class StringReverse {

    public String stringReverseAPI(String text) {
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        return sb.toString();
    }

    public String stringReverse(String text) {

        char[] chars = text.toCharArray();
        int left = 0;
        int right = text.length() - 1;
        for(int i=0;left<right;left++,right--){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
        }
        return String.valueOf(chars);
    }
}
