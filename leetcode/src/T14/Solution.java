package T14;

import com.sun.xml.internal.ws.util.StringUtils;

/**
 * @author xiao.mi
 * @version V1.0
 * @Title:
 * @Description:
 * @date 2017/7/2 22:28
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0){
            return "";
        }

        String commStr = strs[0];
        for(int i  = 1; i < strs.length; i++){
            commStr = find(commStr, strs[i]);
            if("".equals(commStr)){
                return commStr;
            }
        }

        return commStr;
    }

    private String find(String comm, String str){
        for(int i = comm.length(); i >0 ; i--){
            if(str.startsWith(comm.substring(0,i))){
                comm = comm.substring(0, i);
                return comm;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"abc", "abcd", "ab"};
        System.out.println(solution.longestCommonPrefix(strs));
    }
}