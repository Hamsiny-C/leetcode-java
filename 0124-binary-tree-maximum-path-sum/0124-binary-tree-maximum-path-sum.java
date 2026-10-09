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
    private int maxSum;
    public int maxPathSum(TreeNode root) {
    maxSum=Integer.MIN_VALUE;
    pathSum(root);
    return maxSum;
    }
    public int pathSum(TreeNode root){
        if(root==null){
            return 0;
        }
            int leftMax=pathSum(root.left);
            int rightMax=pathSum(root.right);
            int allTogether=root.val+leftMax+rightMax;
            int maxLeftSum=Math.max(root.val,root.val+leftMax);
            int maxrightSum=Math.max(root.val,root.val+rightMax);
            int maxofoneside=Math.max(maxLeftSum,maxrightSum);
            int maxSumOfAll=Math.max(maxofoneside,allTogether);
            maxSum=Math.max(maxSum,maxSumOfAll);
            return maxofoneside;
        
    }
}