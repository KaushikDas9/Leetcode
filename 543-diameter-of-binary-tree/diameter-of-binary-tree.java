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

    static int ans;
    public int diameterOfBinaryTree(TreeNode root) {
         ans=0;
         find(root);
         return ans;
    }

    public static int find( TreeNode root) { 
        if( root == null  ) return 0;

        int l =find(root.left);
        int r =find(root.right);

        ans = Math.max(ans,(l+r));

        return 1+Math.max(l,r);

    }
}