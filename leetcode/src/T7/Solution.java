package T7;

/**
 * @author xiao.mi
 * @version V1.0
 * @Title:
 * @Description:
 * @date 2017/7/1 00:14
 */
public class Solution {

    public int reverse(int x) {
        long result = 0;
        while(x != 0){
            result = result * 10 + x % 10;
            x /= 10;
            if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
                return 0;
            }
        }
        return (int)result;
    }
}