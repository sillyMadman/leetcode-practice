/**
 * 题目Id：35
 * 题目：搜索插入位置
 * 日期：2021-12-28 09:55:44
 */
//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。 
//
// 请必须使用时间复杂度为 O(log n) 的算法。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [1,3,5,6], target = 5
//输出: 2
// 
//
// 示例 2: 
//
// 
//输入: nums = [1,3,5,6], target = 2
//输出: 1
// 
//
// 示例 3: 
//
// 
//输入: nums = [1,3,5,6], target = 7
//输出: 4
// 
//
// 示例 4: 
//
// 
//输入: nums = [1,3,5,6], target = 0
//输出: 0
// 
//
// 示例 5: 
//
// 
//输入: nums = [1], target = 0
//输出: 0
// 
//
// 
//
// 提示: 
//
// 
// 1 <= nums.length <= 104 
// -104 <= nums[i] <= 104 
// nums 为无重复元素的升序排列数组 
// -104 <= target <= 104 
// 
// Related Topics 数组 二分查找 
// 👍 1241 👎 0

package leetcode.editor.cn;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Solution solution = new SearchInsertPosition().new Solution();
        System.out.println("Hello world");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int searchInsert(int[] nums, int target) {

            //这道题可以暴力破解，但是由于数组是有序的，可以使用二分法进行搜索，以达到log(n)的时间复杂度
            //首先有两种情况需要考虑，如果是数组中存在，那么就是通过二分法不断逼近结果，
            //mid的值只要小于目标值，那么就可以让left的值为mid+1的位置，所以至少大于刚才的mid值，
            //一直到left=right=mid，此数如果值等于目标值，那么left就是目标值的位置
            //另外一种情况就是数组中不存在，当left=right=mid依然不等于目标值
            //如果中值小于目标值，那么说明目标值在中值的右侧，取中值位置+1即可。
            //如果中值大雨目标值，那么说明目标值在中值的左侧，刚好把目标值替换掉中值的位置，直接返回中值的位置即可
            int count = nums.length;
            int left = 0;
            int right = count - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return left;


//       int count = nums.length;
//
//       for(int i=0;i<count;i++){
//           if(target==nums[i]){
//               return i;
//           }if(target<nums[i]){
//               return i;
//           }
//       }
//       return  count;
//
//    }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}