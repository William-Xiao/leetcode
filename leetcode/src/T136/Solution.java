package T136;

/**
 * @author xiao.mi
 * @version V1.0
 * @Title:
 * @Description:
 * @date 2017/6/30 10:36
 */
public class Solution {

    public int singleNumber(int[] nums) {

        int result = 0;
        for(int num:nums){
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1,1,2,3,2,6,3,6,-1};
        System.out.println(solution.singleNumber(nums));
    }
}