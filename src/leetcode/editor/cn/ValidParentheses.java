/**
 * 题目Id：20
 * 题目：有效的括号
 * 日期：2021-12-21 09:47:41
 */
//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "()"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "()[]{}"
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：s = "(]"
//输出：false
// 
//
// 示例 4： 
//
// 
//输入：s = "([)]"
//输出：false
// 
//
// 示例 5： 
//
// 
//输入：s = "{[]}"
//输出：true 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 104 
// s 仅由括号 '()[]{}' 组成 
// 
// Related Topics 栈 字符串 
// 👍 2838 👎 0

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new ValidParentheses().new Solution();
        solution.isValid("]");
        System.out.println("Hello world");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValid(String s) {
            //看到这个题目的初步想法是用栈的方法去存入和取出。
            //首先如果这个字符串不是偶数，那么因为括号无法成对，可以初步筛选掉
            //然后如果是左括号就把它压入栈中，
            //如果是右括号就去尝试从栈里弹出，如果是空或者非对应的左括号说明字符串不正确
            //最后但字符串遍历以后栈里面不未空，也说明字符串不正确

            int n = s.length();
            if (n % 2 == 1) {
                return false;
            }

            Map<Character, Character> pairs = new HashMap<Character, Character>() {{
                put(')', '(');
                put(']', '[');
                put('}', '{');
            }};


            Stack stack = new Stack<Character>();
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if ( c == '(' ||  c == '['||c == '{') {
                    stack.push(c);
                }
                if (c == ')' || c == ']' || c == '}') {
                    if(stack.empty()){
                        return false;
                    }
                    c= pairs.get(c);
                    char popChar = (char) stack.pop();
//
                    if (c != popChar) {
                        return false;
                    }
                }

            }
            return stack.empty();



        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}