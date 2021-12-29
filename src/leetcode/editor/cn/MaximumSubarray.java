/**
 * 题目Id：53
 * 题目：最大子数组和
 * 日期：2021-12-29 09:52:44
 */
//给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。 
//
// 子数组 是数组中的一个连续部分。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
//输出：6
//解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [1]
//输出：1
// 
//
// 示例 3： 
//
// 
//输入：nums = [5,4,-1,7,8]
//输出：23
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 105 
// -104 <= nums[i] <= 104 
// 
//
// 
//
// 进阶：如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的 分治法 求解。 
// Related Topics 数组 分治 动态规划 
// 👍 4143 👎 0

package leetcode.editor.cn;

public class MaximumSubarray {
    public static void main(String[] args) {
        Solution solution = new MaximumSubarray().new Solution();
        System.out.println("Hello world");
        int result =solution.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        System.out.println(result);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxSubArray(int[] nums) {
            //动态规划，寻求局部最有解。
            //核心思路就是之前连续子数组的值小于0，则重新开始新的连续子数组，大于0则加上当前最新的值，组成新的子数组值
            //然后再用新的子数组和，与最大值进行比较，替换最大值。
            //以上思想就是每来到一个新的值如何去判断是重新开始还是接着前面的连续子数组继续，只要是前面的值为负显然只会让连续和的值更小，
            //所以此时需要重新开始新的子数组求和。
            //TODO 解释需要进一步说明
            int pre = 0, maxAns = nums[0];
            for (int x : nums) {
                pre = Math.max(pre + x, x);
                maxAns = Math.max(maxAns, pre);
            }
            return maxAns;


//            int count = nums.length;
//            int max= Integer.MIN_VALUE ;
//            int value ;
//
//            for (int i = 0; i < count; i++) {
//                value = 0;
//                for (int j = i; j < count; j++) {
//                    value += nums[j];
//                    if (value > max) {
//                        max = value;
//                    }
//                }
//            }
//            return max;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}