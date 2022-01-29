package com.com.algorithm.tree;

import com.com.algorithm.TreeNode;
import headfirst.designpatterns.flyweight.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// https://leetcode.com/problems/validate-binary-search-tree/discuss/32112/Learn-one-iterative-inorder-traversal-apply-it-to-multiple-tree-questions-(Java-Solution)
public class InOrderTraversal {

    public static void main(String[] args) {
        TreeNode root = createTree();
        List<Integer> order = inorderTraversal(root);
        order.forEach(i -> System.out.println(i));
    }

    public static List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        while(root != null || !stack.isEmpty()) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.key);
            root = root.right;
        }

        return list;
    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        while(root != null || !stack.empty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.key);
            root = root.right;

        }
        return list;
    }

    private static TreeNode createTree() {
        /*  Expected: 7,4,9,10,2,5,1,3
                1
               / \
              2   3
             / \
            4   5
           / \
          7   10
             /
            9
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(10);
        root.left.right = new TreeNode(5);
        root.left.left.right.left = new TreeNode(9);

        return root;
    }
}
