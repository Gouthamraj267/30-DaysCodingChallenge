/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count=1;
    int max=1;
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        fun(root);
        return max;
    }
    public void fun(TreeNode root){
        if(root==null){
            return;
        }
        count++;
        fun(root.left);
        count--;
        max=Math.max(count,max);
        count++;
        fun(root.right);
        count--;
        max=Math.max(count,max);
        
    }
}