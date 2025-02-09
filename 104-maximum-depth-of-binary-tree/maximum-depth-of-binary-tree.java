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
    public int maxDepth(TreeNode root) {
        return find(root,1);
    }


    public static int find( TreeNode root,int lvl ) {
        if( root==null ) return 0;

        int left =find(root.left,lvl+1);
        int right =find(root.right,lvl+1);

        return Math.max( lvl, Math.max(left,right) );
    }
}