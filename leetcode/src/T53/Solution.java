package T53;

/**
 * @author xiao.mi
 * @version V1.0
 * @Title:
 * @Description:
 * @date 2017/10/25 14:46
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            int begin = i;
            int sum = nums[begin];
            if(max < sum){
                max = sum;
            }
            for(int j=i+1; j < nums.length; j++){
                sum += nums[j];
                if(max < sum){
                    max = sum;
                }
            }
        }
        return max;
    }

    public int maxSubArray1(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            if(sum < 0){
                sum = nums[i];
            }else {
                sum += nums[i];
            }
            if(max < sum){
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-2,1};
        System.out.println(solution.maxSubArray(nums));
    }
}