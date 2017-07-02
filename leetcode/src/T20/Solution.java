package T20;

import java.util.Stack;

/**
 * @author xiao.mi
 * @version V1.0
 * @Title:
 * @Description:
 * @date 2017/7/2 23:31
 */
public class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            switch (ch){
                case '(':
                case '{':
                case '[':stack.push(ch);break;
                case ')':
                    if(!stack.isEmpty() && stack.peek().equals('(')){
                        stack.pop();
                        break;
                    }else{
                        return false;
                    }
                case '}':
                    if(!stack.isEmpty() && stack.peek().equals('{')){
                        stack.pop();
                        break;
                    }else{
                        return false;
                    }
                case ']':
                    if(!stack.isEmpty() && stack.peek().equals('[')){
                        stack.pop();
                        break;
                    }else{
                        return false;
                    }
            }
        }

        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "]";
        Solution solution = new Solution();
        System.out.println(solution.isValid(s));
    }
}