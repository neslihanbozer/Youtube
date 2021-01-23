public class LonelyInteger {

    public int findLonelyInteger(int[] array) {
        int result = 0;
        for(int value: array){
            result ^= value;
        }
        return result;
    }
}
