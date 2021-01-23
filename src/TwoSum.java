import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] testTwoSumOne(int[] nums, int target){
        int[] twoSum = new int[2];
        for (int i=0; i<nums.length; i++){
            for (int j=0; j<nums.length; j++){
                if(nums[j] == target-nums[i]){
                    twoSum = new int[]{i, j};
                }
            }
        }
        Arrays.sort(twoSum);
        return twoSum;
    }

    public int[] testTwoSumTwo(int[] nums, int target){
        int[] twoSum = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], i);
        }
        for (int i=0; i<nums.length ;i++){
            int complement = target - nums[i];
            if( map.containsKey(complement) && map.get(complement) != 0){
                twoSum = new int[]{i ,map.get(complement)};
            }
        }
        Arrays.sort(twoSum);
        return twoSum;
    }

    public int[] testTwoSumThree(int[] nums, int target){
        Arrays.sort(nums);

        int[] result = new int[2];
        int pointerLeft = 0;
        int pointerRight = nums.length -1;

        while( (nums[pointerLeft] + nums[pointerRight]) != target){

            if( (nums[pointerLeft] +nums[pointerRight]) > target){
                pointerRight--;
            }else {
                pointerLeft++;
            }
        }

        if( (nums[pointerLeft] + nums[pointerRight]) == target){
            result = new int[] {pointerLeft, pointerRight};
        }
        return  result;
    }



}
