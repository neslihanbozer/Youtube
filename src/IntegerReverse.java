public class IntegerReverse {

    public int reverseByString(int x){

        boolean isNegative = x < 0 ? true : false;

        if(isNegative){
            x = x * -1;
        }

        String s = String.valueOf(x);

        StringBuilder sb = new StringBuilder(s);

        sb.reverse();

        int value = Integer.parseInt(sb.toString());

        return isNegative ? value * -1 : value;
    }


    public int reverseInteger(int x) {

        boolean isNegative = x < 0 ? true : false;

        if(isNegative){
            x = x * -1;
        }

        int reverse = 0;
        int lastDigit = 0;

        while(x >= 1){
            lastDigit = x % 10; // returns the last digit
            reverse = reverse * 10 + lastDigit;
            x = x / 10; // get rid of last digit
        }

        return isNegative == true ? reverse *-1 : reverse;
    }
}
