package T38;

/**
 * @author xiao.mi
 * @version V1.0
 * @Title:
 * @Description:
 * @date 2017/10/25 11:22
 */
public class Solution {
    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder("1");
        while(--n > 0){
            int count = 1;
            StringBuilder tempSb = new StringBuilder();
            for(int i=1; i<=sb.length();i++){
                if(i == sb.length() || sb.charAt(i) != sb.charAt(i-1)){
                    tempSb.append(count);
                    tempSb.append(sb.charAt(i-1));
                    count = 1;
                }else {
                    count++;
                }
            }
            sb = tempSb;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countAndSay(4));
    }
}