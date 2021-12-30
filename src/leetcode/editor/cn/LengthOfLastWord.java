/**
 * 题目Id：58
 * 题目：最后一个单词的长度
 * 日期：2021-12-30 09:32:15
 */
//给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中最后一个单词的长度。 
//
// 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "Hello World"
//输出：5
// 
//
// 示例 2： 
//
// 
//输入：s = "   fly me   to   the moon  "
//输出：4
// 
//
// 示例 3： 
//
// 
//输入：s = "luffy is still joyboy"
//输出：6
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 104 
// s 仅有英文字母和空格 ' ' 组成 
// s 中至少存在一个单词 
// 
// Related Topics 字符串 
// 👍 407 👎 0

package leetcode.editor.cn;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Solution solution = new LengthOfLastWord().new Solution();
        System.out.println("Hello world");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLastWord(String s) {
            //求得字符串的长度，然后进行反向遍历即可
            //去除尾部的空格，然后从尾部计算到下一个空格的长度

            int index = s.length() - 1;
            while (s.charAt(index) == ' ') {
                index--;
            }
            int wordLength = 0;
            while(index>=0 && s.charAt(index)!=' '){
                wordLength++;
                index--;
            }
            return wordLength;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}