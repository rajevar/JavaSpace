package com.com.algorithm;

/* Class containing left and right child of current
node and key value*/
public class TreeNode {
    public int key;
    public TreeNode left, right;

    public TreeNode(int item) {
        key = item;
        left = right = null;
    }
}