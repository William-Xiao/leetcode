package T27;

/**
 * @author xiao.mi
 * @version V1.0
 * @Title:
 * @Description:
 * @date 2017/7/14 21:50
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0 ;i<nums.length; i++){
            if(nums[i] == val){
                count++;
            }
        }
        return nums.length-count;
    }
}