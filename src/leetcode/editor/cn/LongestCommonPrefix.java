/**
 * 题目Id：14
 * 题目：最长公共前缀
 * 日期：2021-12-20 09:37:22
 */
//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 
//
// 示例 1： 
//
// 
//输入：strs = ["flower","flow","flight"]
//输出："fl"
// 
//
// 示例 2： 
//
// 
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。 
//
// 
//
// 提示： 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] 仅由小写英文字母组成 
// 
// Related Topics 字符串 
// 👍 1924 👎 0

package leetcode.editor.cn;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution solution = new LongestCommonPrefix().new Solution();
        String str = "woshishafz";
        System.out.println(str.substring(0,0));
        System.out.println("Hello world");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            //最容易想到的是将数组中的字符串从头到尾依次对比
            //因此需要将字符组的第一个字符串的与每个进行对比
            //判断两个条件，一是后面字符串的长度是否够，二是对比的两个字符串对比的位置是否相等
            //如果不相等则返回前面的字符串,没有第一次就没有对比上，直接返回0到0闭必后开的，即""
            //如果全部符合，则返回第一个全部字符串
            if (strs == null || strs.length == 0) {
                return "";
            }
            int length = (strs[0].length());
            int count = (strs.length);
            for (int i = 0; i < length; i++) {
                char f = strs[0].charAt(i);
                for (int j = 1; j < count; j++) {
                    if (i == strs[j].length() || strs[j].charAt(i) != f) {
                        return strs[0].substring(0, i);
                    }
                }
            }

            return strs[0];

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}