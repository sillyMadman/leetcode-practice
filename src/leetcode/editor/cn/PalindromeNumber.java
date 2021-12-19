/**
 * 题目Id：9
 * 题目：回文数
 * 日期：2021-12-19 15:06:04
 */
//给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。 
//
// 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。 
//
// 
//
// 示例 1： 
//
// 
//输入：x = 121
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：x = -121
//输出：false
//解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
// 
//
// 示例 3： 
//
// 
//输入：x = 10
//输出：false
//解释：从右向左读, 为 01 。因此它不是一个回文数。
// 
//
// 示例 4： 
//
// 
//输入：x = -101
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// -231 <= x <= 231 - 1 
// 
//
// 
//
// 进阶：你能不将整数转为字符串来解决这个问题吗？ 
// Related Topics 数学 
// 👍 1720 👎 0

package leetcode.editor.cn;

public class PalindromeNumber {
    public static void main(String[] args) {
        Solution solution = new PalindromeNumber().new Solution();
        System.out.println("Hello world");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPalindrome(int x) {
            //首先我们容易知道所有负数都不是回文数，可以直接判断为false。
            //因为整数首位数不可能位0，所以最后一位数即个位数为0也是false。
            //然后作为回文数可以逆过来必须前半部分和后半部分一样，
            //通过得到后半部分的回文数对比前半部分就可以，
            //一旦从后取的回文数大于或等于前面剩下的数就说明至少达到了一般
            //如果是偶数的话，就说明恰好到达了一半
            //如果是奇数的话，就说明超过了一半，舍掉最后一位进行对比即可


            if (x < 0 || (x % 10 == 0 && x != 0)) {
                return false;
            } else if (x == 0) {
                return true;
            }
            int y = 0;
            while (x > y) {
                y = y * 10 + x % 10;
                x /=10;

            }

            return x==y || x == y /10;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}