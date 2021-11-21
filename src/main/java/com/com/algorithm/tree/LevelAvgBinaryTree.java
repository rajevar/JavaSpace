package com.com.algorithm.tree;

import com.com.algorithm.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LevelAvgBinaryTree {
    public List< Double > averageOfLevels(TreeNode root) {
        List < Integer > count = new ArrayList< >();
        List < Double > res = new ArrayList < > ();
        average(root, 0, res, count);
        for (int i = 0; i < count.size(); i++)
            res.set(i, res.get(i) / count.get(i));
        return res;
    }
    public void average(TreeNode t, int i, List < Double > sum, List < Integer > count) {
        if (t == null)
            return;
        if (i < sum.size()) {
            sum.set(i, sum.get(i) + t.key);
            count.set(i, count.get(i) + 1);
        } else {
            sum.add(1.0 * t.key);
            count.add(1);
        }
        average(t.left, i + 1, sum, count);
        average(t.right, i + 1, sum, count);
    }

    public static void main(String[] args) {
        LevelAvgBinaryTree avgBinaryTree = new LevelAvgBinaryTree();
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(9);
        tree.left.right = new TreeNode(10);
        tree.right = new TreeNode(20);
        tree.right.left = new TreeNode(15);
        tree.right.right = new TreeNode(7);
        List<Double> result = avgBinaryTree.averageOfLevels(tree);
        System.out.print(result.toString());
    }
}
