package com.chad.leetcode.subject.easy;

/**
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
 *
 *  
 *
 * 示例 :
 * 给定二叉树
 *
 *           1
 *          / \
 *         2   3
 *        / \
 *       4   5
 * 返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/diameter-of-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class DiameterOfBinaryTree {

    private int maxDepth = 1;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return maxDepth - 1;
    }

    private int depth(TreeNode root){
        if(root==null) return 0;
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        maxDepth = Math.max(leftDepth+rightDepth+1,maxDepth);
        return Math.max(leftDepth,rightDepth)+1;
    }

    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
