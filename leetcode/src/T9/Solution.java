package T9;

/**
 * @author xiao.mi
 * @version V1.0
 * @Title:
 * @Description:
 * @date 2017/7/1 23:02
 */
public class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0){
            return false;
        }

        int result = 0;
        int n = x;
        while(n != 0){
            result = result * 10 + n % 10;
            n /= 10;
        }
        if(x == result){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(-2147447412));
    }
}