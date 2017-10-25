package T36;

/**
 * @author xiao.mi
 * @version V1.0
 * @Title: 二分查找
 * @Description:
 * @date 2017/10/24 15:04
 */
public class Solution2 {
    public int searchInsert(int[] nums, int target) {
        if(nums.length <= 0 || nums[0] >= target){
            return 0;
        }
        if(nums[nums.length - 1] < target){
            return nums.length;
        }
        int begin = 0;
        int end = nums.length-1;
        return find(begin, end, nums, target);

    }

    private int find(int begin, int end, int[] nums, int target) {
        int mid = (begin + end)/2;
        if(mid == 0){
            if(nums[begin] < target){
                return end;
            }else {
                return 0;
            }
        }
        if(nums[mid] >= target && nums[mid-1] < target){
            return mid;
        }
        if(nums[mid] >= target){
            return find(begin, mid, nums, target);
        }else {
            return find(mid + 1, end, nums, target);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5};
        int target = 4;
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.searchInsert(nums, target));
    }

}