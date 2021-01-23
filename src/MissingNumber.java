public class MissingNumber {

    public int findMissingNumber(int[] array) {

        int length = array.length;
        int[] fullArray = new int[length+1];
        int result = 0;

        // XOR the full array first
        for(int i=0;i<fullArray.length;i++){
            fullArray[i] = (i+1);
            result ^= fullArray[i];
        }

        // XOR the result with the original array
        for(int j=0;j<array.length;j++){
            result ^= array[j];
        }

        return result;

    }
}
