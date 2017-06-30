package T1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiao.mi
 * @version V1.0
 * @Title:
 * @Description:
 * @date 2017/6/30 20:12
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numsMap = new HashMap<Integer, Integer>();


        for(int i = 0; i < nums.length; i++){
            if(numsMap.containsKey(target-nums[i])){
                int[] result = {numsMap.get(target-nums[i]), i+1};
                return result;
            }
            numsMap.put(nums[i], i + 1);
        }
        int[] a = {};
        return a;
    }

    public static void main(String[] args) {
        int[] nums = {-1,1,3, 4, 2, -2, 6};
        Solution solution = new Solution();
        System.out.println(solution.twoSum(nums, 9));
    }
}