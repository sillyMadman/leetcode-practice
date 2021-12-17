/**
 * 题目Id：7
 * 题目：整数反转
 * 日期：2021-12-17 13:28:17
 */
//给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。 
//
// 如果反转后整数超过 32 位的有符号整数的范围 [−231, 231 − 1] ，就返回 0。 
//假设环境不允许存储 64 位整数（有符号或无符号）。
//
// 
//
// 示例 1： 
//
// 
//输入：x = 123
//输出：321
// 
//
// 示例 2： 
//
// 
//输入：x = -123
//输出：-321
// 
//
// 示例 3： 
//
// 
//输入：x = 120
//输出：21
// 
//
// 示例 4： 
//
// 
//输入：x = 0
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// -231 <= x <= 231 - 1 
// 
// Related Topics 数学 
// 👍 3322 👎 0

package leetcode.editor.cn;

import static org.junit.Assert.*;

public class ReverseInteger {

    public static void main(String[] args) {
        Solution solution = new ReverseInteger().new Solution();
        System.out.println(solution.reverse(-2147483412));
        System.out.println("Hello world");
        assertEquals(-2143847412, solution.reverse(-2147483412));
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int reverse(int x) {
            //要把一个数反转，核心思路就是把前面的数取出来放后面，或着把后面的数取出来放前面。
            //如果用数学方法的话我们没办法事先知道数字的位数(除非事先转换为字符串)
            //所以我们只能从后面往前取，我们可以通过对取余的方法知道最后一位数，并通过取模的方法
            //保留前面的数字，然后每取最后一位数，就对前面的结果乘十，把新取的数字就可以放到最后面
            //这样就能通过数学方法完成数字的反转，同时记得把反转后的数字进行判断是否在范围内
//
            long n = 0;
            while(x != 0) {
                n = n*10 + x%10;
                x = x/10;
            }
            return (int)n==n? (int)n:0;


//根据字符串和栈去进行反转
//            String flag = "";
//            String str = String.valueOf(x);
//            if (x < 0) {
//               flag = "-";
//                str = str.substring(1);
//            }
//            String[] str_array = str.split("");
//            Stack stack = new Stack();
//            for (String num : str_array) {
//                stack.push(num);
//            }
//            String new_str = "";
//            while (!stack.isEmpty()) {
//                new_str += stack.pop();
//            }
//            new_str = flag + new_str;
//
//            Long new_long = Long.parseLong(new_str);
//            if(new_long>Integer.MAX_VALUE || new_long<Integer.MIN_VALUE){
//                return 0;
//            }else{
//                return  new_long.intValue();
//            }


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}