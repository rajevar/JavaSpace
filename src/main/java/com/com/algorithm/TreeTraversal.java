package com.com.algorithm;

// Java program for different tree traversals

class TreeTraversal {
    // Root of Binary Tree
    TreeNode root;

    TreeTraversal() {
        root = null;
    }

    /* Given a binary tree, print its nodes according to the
    "bottom-up" postorder traversal. */
    void printPostorder(TreeNode node) {
        if (node == null)
            return;
        // first recur on left subtree
        printPostorder(node.left);
        // then recur on right subtree
        printPostorder(node.right);
        // now deal with the node
        System.out.print(node.key + " ");
    }

    /* Given a binary tree, print its nodes in inorder*/
    void printInorder(TreeNode node) {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left);
        /* then print the data of node */
        System.out.print(node.key + " ");
        /* now recur on right child */
        printInorder(node.right);
    }

    /* Given a binary tree, print its nodes in preorder*/
    void printPreorder(TreeNode node) {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.key + " ");
        /* then recur on left sutree */
        printPreorder(node.left);
        /* now recur on right subtree */
        printPreorder(node.right);
    }

    // Root Left Right
    void myPreOder(TreeNode node) {
        if(node == null) {
            return;
        }
        System.out.print(node.key + " ");
        myPreOder(node.left);
        myPreOder(node.right);
    }

    // Wrappers over above recursive functions
    void printPostorder() {
        printPostorder(root);
    }

    void printInorder() {
        printInorder(root);
    }

    void printPreorder() {
        printPreorder(root);
    }

    // Driver method
    public static void main(String[] args) {

        /*
                 1
                / \
               2   3
              / \
             4   5
             PreOder  > Root Left Right > 1 2 4 5 3
             InOder   > Left Root Right > 4 2 5 1 3
             PostOder > Left Right Root > 4 5 2 3 1
         */
        TreeTraversal tree = new TreeTraversal();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        tree.myPreOder(tree.root);
        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder();


        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder();

        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostorder();

    }
}

