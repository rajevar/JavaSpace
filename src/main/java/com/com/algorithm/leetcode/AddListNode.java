package com.com.algorithm.leetcode;

// https://leetcode.com/problems/add-two-numbers/
public class AddListNode {

    public static void main(String[] args) {
        ListNode node1 = ListNode.createListNode(new int[] { 9,9,9,9,9,9,9} );
        ListNode node2 = ListNode.createListNode(new int[] { 9,9,9,9} );
        int assertResult[] = new int[] {8,9,9,9,0,0,0,1};

        ListNode res = addTwoNumbers(node1, node2);
        ListNode.show(node1);
        ListNode.show(node2);
        ListNode.show(res);
        
        assert assertCheck(res, assertResult) == true;

    }

    private static boolean assertCheck(ListNode res, int[] assertResult) {
        for(int val: assertResult) {
            if(res.val != val) {
                return false;
            }
            res = res.next;
        }
        return true;
    }


    static ListNode addTwoNumbers(ListNode c1, ListNode c2) {
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;
        int sum = 0;
        while (c1 != null || c2 != null) {
            sum /= 10;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
        }
        if (sum / 10 == 1)
            d.next = new ListNode(1);
        return sentinel.next;
    }

}

