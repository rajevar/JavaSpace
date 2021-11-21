package com.com.algorithm.leetcode;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/

import java.util.HashMap;
import java.util.List;

public class RemoveNode {

    public static void main(String[] args) {
        ListNode node = ListNode.createListNode(new int[] {1,2,3,4,5} );
        ListNode result = removeNthFromEnd2(node, 4);
        ListNode.show(result);
    }

    public static  ListNode removeNthFromEnd(ListNode head, int n) {
        int index = 1;
        HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode tempNode = head;
        while(tempNode != null) {
            map.put(index, tempNode);
            tempNode = tempNode.next;
            ++index ;
        }
        int toRemove = --index - (n-1);
        ListNode node = map.get(toRemove);
        ListNode prevNode = map.get(toRemove-1);
        if(prevNode == null ) {
            head = node.next;
        } else {
            prevNode.next = node.next;
        }
        return head;
    }

    public static ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        // Advances first pointer so that the gap between first and second is n nodes apart
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }


}
