package com.ustc.leetcode.utils;

import java.util.Scanner;

public class ListNodeUtils {
    public static ListNode create(){
        ListNode dummy = new ListNode();
        ListNode headnode = dummy;
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            ListNode listNode = new ListNode(scan.nextInt());
            headnode.next = listNode;
            headnode = listNode;
        }
        return dummy.next;
    }
    /**
     * 建立链表
     * @param head
     * @return
     */
    public static ListNode init(String head){
        head = head.substring(1,head.length() - 1);
        String[] split = head.split(",");
        ListNode dummy = new ListNode();
        ListNode headnode = dummy;
        for(String str : split){
            ListNode listNode = new ListNode(Integer.parseInt(str));
            headnode.next = listNode;
            headnode = listNode;
        }
        return dummy.next;

    }

    /**
     * 打印链表
     * @param head
     */
    public static void print(ListNode head){
        while(head != null){
            System.out.print(head.val + "\t");
            head = head.next;
        }
    }
}
