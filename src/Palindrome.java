public class Palindrome {

    public boolean isPalindrome_f1(String str) {
        int low = 0;
        int high = str.length()-1;

        while(low<high){
            if(str.charAt(low++) != str.charAt(high--)) return false;
        }

        return true;
    }

    public boolean isPalindrome_f2(String str) {

        char[] strArray = str.toCharArray();

        int half = strArray.length/2;
        int low = 0;
        int high = strArray.length -1;

        while(low<high){
            if(strArray[low] == strArray[high]){
                low++;
                high--;
            }else {
                return false;
            }
        }
        return true;
    }
}
