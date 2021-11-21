package com.com.algorithm.tree;

import com.com.algorithm.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class MyLevelAvg {

    private List<Double> averageOfLevels(TreeNode tree) {
        List<Integer> count = new ArrayList<>();
        List<Double> sum = new ArrayList<>();
        List<Double> result = new ArrayList<>();
        findAvg(tree, count, sum, 0);
        System.out.println(sum.toString());
        System.out.println(count.toString());
        for(int i = 0; i < sum.size(); i++) {
            result.add(i , sum.get(i)/count.get(i));
        }
        return  result;
    }

    private void findAvg(TreeNode tree, List<Integer> count, List<Double> sum, int level) {
        if(tree == null) {
            return;
        }
        // if the level is less than list size (either sum or count), then update values in sum/count list.
        if(level < sum.size()) {
            count.set(level, count.get(level) + 1);
            sum.set(level, sum.get(level) + tree.key);
        } else {
            count.add(1);
            sum.add(1.0 * tree.key);
        }

        findAvg(tree.left, count, sum, level+1);
        findAvg(tree.right, count, sum, level+1);

    }

    // pre order search
    private void preOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        System.out.print(root.key + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
/*
          3         > 03/1
       /     \
      9       20    > 29/2
       \     /  \
       14   15   7  > 36/3
 */

    public static void main(String[] args) {
        MyLevelAvg avgBinaryTree = new MyLevelAvg();
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(9);
        tree.left.right = new TreeNode(14);
        tree.right = new TreeNode(20);
        tree.right.left = new TreeNode(15);
        tree.right.right = new TreeNode(7);

        List<Double> result = avgBinaryTree.averageOfLevels(tree);
        System.out.println(result.toString());
        avgBinaryTree.preOrder(tree);
    }
}
