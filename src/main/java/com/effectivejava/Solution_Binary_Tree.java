package com.effectivejava;

import java.util.*;
import java.io.*;



class Solution {

    /*
    class Node
        int data;
        Node left;
        Node right;
    */
    public static int getHeight(Node root){
        if (root == null){
            return -1;
        }
        else {
            return 1 + Math.max( getHeight(root.left), getHeight(root.right) );
        }
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            System.out.println("creating node for > " + data);
            return new Node(data);
        } else {

            Node cur;
            if(data <= root.data) {
                System.out.println("LEFT | data : " + data + " | root: " + root.data);
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                System.out.println("RIGHT | data : " + data + " | root: " + root.data);
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            System.out.println("data > " + data);
            root = insert(root, data);
            System.out.println("root >>> " + root.data);
        }
        scan.close();
        System.out.println("root > " + root.data);
        int height = getHeight(root);
        System.out.println(height);
    }
}