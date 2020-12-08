package com.chad.leetcode.subject.easy;

/**
 *  给定一个二叉树，检查它是否是镜像对称的。
 *
 *  
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 *  
 *
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/symmetric-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class SymmetricTree {

    /**
     * 题意是判断一棵二叉树是否左右对称，首先想到的是深搜，比较根结点的左右两棵子树是否对称，
     * 如果左右子树的值相同，那么再分别对左子树的左节点和右子树的右节点，左子树的右节点和右子树的左节点做比较即可。
     */
    public boolean isSymmetric(TreeNode root) {
        return root==null||helper(root.left,root.right);
    }

    private boolean helper(TreeNode left,TreeNode right){
        if(left==null&&right==null) return true;
        if(left==null||right==null) return false;
        if(left.val==right.val){
            return helper(left.left,right.right)&&helper(left.right,right.left);
        }
        return false;
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
