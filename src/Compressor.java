public class Compressor {

    public String compress(String string) {

        StringBuilder s = new StringBuilder();
        char[] strArray = string.toCharArray();
        int k=0;
        for(int i=0;i<string.length();i++){
            k=i;
            int count = 1;
            while(k+1 < string.length() && strArray[k] == strArray[k+1]){
                count++;
                k++;
            }
            s = s.append(strArray[i]);
            s = s.append(count);
            i = k;
        }
        return string.length() <= s.length() ? string : s.toString();
    }
}
