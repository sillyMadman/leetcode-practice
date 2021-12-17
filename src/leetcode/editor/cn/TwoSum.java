/**
  * 题目Id：1
  * 题目：两数之和
  * 日期：2021-12-17 10:50:49
*/
//给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。 
//
// 你可以按任意顺序返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [2,7,11,15], target = 9
//输出：[0,1]
//解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [3,2,4], target = 6
//输出：[1,2]
// 
//
// 示例 3： 
//
// 
//输入：nums = [3,3], target = 6
//输出：[0,1]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 104 
// -109 <= nums[i] <= 109 
// -109 <= target <= 109 
// 只会存在一个有效答案 
// 
//
// 进阶：你可以想出一个时间复杂度小于 O(n2) 的算法吗？ 
// Related Topics 数组 哈希表 
// 👍 12887 👎 0

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
        System.out.println("Hello world");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //target是两个数x+y的值，那么可以推导出y=target-x,那么当给定x的时候，去判断存不存在y，
        //即可以用暴力破解法去循环查找，也可以将数组中的数据以hash的方式放入内存中，可以快速确定y是否存在于数组中，
        //那么此时间复杂度由O(n)降为了O(1)，但相对应的代价是空间复杂度提升到了O(n),可以优化的是一边放入内存，
        //一边验证，就不需要等所有数据都放入内存，但不会影响复杂度

         Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
         int i = 0;

         for( int x:nums) {
           if(  hashMap.containsKey(target -x)){
             return  new int[]{hashMap.get(target -x),i};
           }
             hashMap.put(x,i);
             i++;
         }

         return new int[0];




    }
}
//leetcode submit region end(Prohibit modification and deletion)

}