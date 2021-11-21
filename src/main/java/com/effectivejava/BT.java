package com.effectivejava;

import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BT {

    private static TreeNode insert(TreeNode root, int data) {
        if(root == null) {
            return new TreeNode(data);
        } else {
            TreeNode child = null;
            if (root.data < data) {
                child = insert(root.left, data);
                root.left = child;
            } else {
                child = insert(root.right, data);
                root.right = child;
            }
            return root;
        }
    }

    private static int getHeight(TreeNode root) {
        int height = -1;
        if(root != null) {
            height = 1 + Math.max( getHeight(root.left), getHeight(root.right));
        }
        return  height;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        TreeNode root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
            System.out.println("root >>> " + root.data);
        }
        scan.close();
        System.out.println("root > " + root.data);
        int height = getHeight(root);
        System.out.println(height);
    }
}
