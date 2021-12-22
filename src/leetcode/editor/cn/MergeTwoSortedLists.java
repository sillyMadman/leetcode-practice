/**
 * 题目Id：21
 * 题目：合并两个有序链表
 * 日期：2021-12-22 09:40:23
 */
//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 
//
// 示例 1： 
//
// 
//输入：l1 = [1,2,4], l2 = [1,3,4]
//输出：[1,1,2,3,4,4]
// 
//
// 示例 2： 
//
// 
//输入：l1 = [], l2 = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [], l2 = [0]
//输出：[0]
// 
//
// 
//
// 提示： 
//
// 
// 两个链表的节点数目范围是 [0, 50] 
// -100 <= Node.val <= 100 
// l1 和 l2 均按 非递减顺序 排列 
// 
// Related Topics 递归 链表 
// 👍 2106 👎 0

package leetcode.editor.cn;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        Solution solution = new MergeTwoSortedLists().new Solution();
        System.out.println("Hello world");
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            //首先判断两个ListNode是否为空，如果是的话直接返回另一个ListNode
            //然后判断两个ListNode的值，由较小的那个作为开始，然后不断获取两个ListNode
            //对比后的较小值，用递归处理。
            //以上进一步而言就是如果两个ListNode都不为空的情况下就进行循环，
            //获取较小的那一个值同时拿到其的next ListNode，只到其中又一个为空，
            //把另一个不为空的全部加到末尾即可。

            if(list1 == null){
                return  list2;
            }else if(list2 == null){
                return list1;
            }else if (list1.val < list2.val){
                list1.next = mergeTwoLists(list1.next,list2);
                return list1;
            }else{
                list2.next = mergeTwoLists(list1,list2.next);
                return list2;
            }


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
