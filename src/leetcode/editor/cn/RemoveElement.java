/**
 * 题目Id：27
 * 题目：移除元素
 * 日期：2021-12-24 09:26:49
 */
//给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。 
//
// 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。 
//
// 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。 
//
// 
//
// 说明: 
//
// 为什么返回数值是整数，但输出的答案是数组呢? 
//
// 请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。 
//
// 你可以想象内部操作如下: 
//
// 
//// nums 是以“引用”方式传递的。也就是说，不对实参作任何拷贝
//int len = removeElement(nums, val);
//
//// 在函数里修改输入数组对于调用者是可见的。
//// 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
//for (int i = 0; i < len; i++) {
//    print(nums[i]);
//}
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [3,2,2,3], val = 3
//输出：2, nums = [2,2]
//解释：函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。你不需要考虑数组中超出新长度后面的元素。例如，函数返回的新长度为 2 ，而 num
//s = [2,2,3,3] 或 nums = [2,2,0,0]，也会被视作正确答案。
// 
//
// 示例 2： 
//
// 
//输入：nums = [0,1,2,2,3,0,4,2], val = 2
//输出：5, nums = [0,1,4,0,3]
//解释：函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。注意这五个元素可为任意顺序。你不需要考虑数组中超出新长度后面
//的元素。
// 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 100 
// 0 <= nums[i] <= 50 
// 0 <= val <= 100 
// 
// Related Topics 数组 双指针 
// 👍 1125 👎 0

package leetcode.editor.cn;

public class RemoveElement {
    public static void main(String[] args) {
        Solution solution = new RemoveElement().new Solution();
        System.out.println("Hello world");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int removeElement(int[] nums, int val) {
            //在原有数组上操作那么就需要两个指针，其中一个指针需要遍历元素
            //遍历的指针如果都从左开始，可能两个指针都会把所有元素遍历一次，且第一个位置可能要重复赋值
            //如果把指针一左一右放着，两个指针合起来的遍历了一遍，但被替换的元素需要重新检查。
            //1.双指针都从左，快的指针从头到尾遍历，需要的元素给慢指针一个个替换
            //2.双指针从两端开始，左指针从左开始遍历，遇到不需要的元素就和右指针的元素替换
            //把右指针向左移，在对左指针那个位置进行检查，如果是需要的元素就直接往右移


            int left = 0;
            int right = nums.length;
            while (left < right) {
                if (nums[left] == val) {
                    nums[left] = nums[right - 1];
                    right--;
                } else {
                    left++;
                }
            }
            return left;


//  int count = nums.length;
//            int left=0;
//            for(int right=0;right<count;right++){
//                if(nums[right] != val){
//                    nums[left] = nums[right];
//                    left++;
//                }
//
//            }
//
//            return left;

        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}