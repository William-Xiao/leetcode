package T36;

/**
 * @author xiao.mi
 * @version V1.0
 * @Title:
 * @Description:
 * @date 2017/10/24 15:04
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length <= 0){
            return 0;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }
}