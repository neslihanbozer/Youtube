public class CutWood {

    public int cutWood(int[] wood, int k) {
        // Corner case
        if(wood.length == 0 || k == 0) return 0;
        int left = 1;
        int right = getMaxValue(wood);
        int res = 0;

        if(!isValid(wood, left, k)) return 0;

        while(left < right){
            int mid = left + (right - left)/2;
            boolean valid = isValid(wood, mid, k);
            if(valid){
                left = mid + 1;
                res = mid;
            } else{
                right = mid;
            }
        }
        return res;
    }

    private int getMaxValue(int[] wood) {
        int max = 0;
        for(int i : wood){
            if( i > max){
                max = i;
            }
        }
        return max;
    }

    private boolean isValid(int[] wood, int cutLength, int k) {
        int count = 0;
        for(int w : wood){
            count += w / cutLength;
        }
        return count >= k;
    }
}
