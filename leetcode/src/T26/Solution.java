package T26;

/**
 * @author xiao.mi
 * @version V1.0
 * @Title:
 * @Description:
 * @date 2017/7/14 21:10
 */
public class Solution {
//    public int removeDuplicates(int[] nums) {
//        if(nums.length <= 1){
//            return 1;
//        }
//
//        for(int i=0; i<nums.length - 1; i++){
//            if(nums[i] == nums[i+1]){
//                nums[i] = 2*nums[i];
//            }
//        }
//
//        int count = 0;
//        for(int i=0; i<nums.length - 1; i++){
//            if(nums[i] < nums[i+1] || i == nums.length - 2){
//                count++;
//            }
//        }
//        return count;
//    }

    public int removeDuplicates(int[] nums) {
        if(nums.length <= 1){
            return nums.length;
        }
        int len = 1;//新的长度，至少为1,以下循环从i=1开始
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){//不等于前一个元素，长度+1
                nums[len++] = nums[i];//将新的元素装到前len个
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] a = {1,1};
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(a));
    }
}