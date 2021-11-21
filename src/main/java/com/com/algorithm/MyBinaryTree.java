package com.com.algorithm;

public class MyBinaryTree {

    TreeNode root;

    public static void main(String[] args) {
        MyBinaryTree tree = new MyBinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.left.left = new TreeNode(7);
        tree.root.left.left.right = new TreeNode(10);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder();
    }

    void printPreorder() {
        printProrderTraversal(root);
    }

    void printProrderTraversal(TreeNode treeNode) {
        if(treeNode == null)
            return;

        System.out.print(treeNode.key + " ");
        printProrderTraversal(treeNode.left);
        printProrderTraversal(treeNode.right);
    }
}
