package com.ustc.leetcode.lianbiao;

import com.ustc.leetcode.utils.ListNode;
import com.ustc.leetcode.utils.ListNodeUtils;

/**
 * 反转链表
 */
public class lc206 {
    public static void main(String[] args) {
//        String head = "[1,2,3,4,5]";
//        ListNode headnode = ListNodeUtils.init(head);
        ListNode headnode = ListNodeUtils.create();
//        ListNode res = new Solution1().reverseList(headnode);
//        ListNodeUtils.print(res);
        ListNode res = new Solution2().reverseList(headnode);
        ListNodeUtils.print(res);
    }
}

class Solution1 {
    /**
     * 迭代法
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode node = cur.next;
            cur.next = pre;
            pre = cur;
            cur = node;
        }
        return pre;
    }
}

//class Solution2 {
//    /**
//     * 递归法
//     * @param head
//     * @return
//     */
//    public ListNode reverseList(ListNode head) {
//        return reverse(head);
//    }
//
//    public ListNode reverse(ListNode head){
//        if(head.next == null){
//            return head;
//        }
//        ListNode pre = reverse(head.next);
//        return pre;
//    }
//}
//
//class Solution3 {
//    /**
//     * 递归法
//     * @param head
//     * @return
//     */
//    public ListNode reverseList(ListNode head) {
//        return reverse(null,head);
//    }
//
//    public ListNode reverse(ListNode pre,ListNode head){
//        if(head == null){
//            return pre;
//        }
//        ListNode node = reverse(head,head.next);
//        node.next = pre;
//        return
//    }
//}