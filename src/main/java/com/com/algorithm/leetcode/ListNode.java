package com.com.algorithm.leetcode;

public class ListNode {
    int val;
    ListNode next;

    ListNode(){
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode node) {
        this.val = val;
        this.next = node;
    }

    static ListNode createListNode(int[] arr) {
        ListNode newNode = null;
        ListNode root = null;
        for(int value :arr) {
            ListNode node = new ListNode(value);
            if(root == null) {
                root = node;
                newNode = root;
                continue;
            }
            newNode.next = node;
            newNode = node;
        }
        return root;
    }

    static void show(ListNode res) {
        while(res != null) {
            System.out.print(res.val + "-");
            res = res.next;
        }
        System.out.println();
    }
}
