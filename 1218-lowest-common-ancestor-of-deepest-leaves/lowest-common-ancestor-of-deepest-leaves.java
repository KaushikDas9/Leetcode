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

    static int maxDeep=-1;
    static TreeNode ans=null;

    public static int find( int dep,TreeNode root,TreeNode parent ) { 

        if( root==null ) {
            maxDeep = Math.max(maxDeep,dep);
            return dep;
        }

        int l = find( dep+1,root.left,root  );
        int r = find( dep+1,root.right,root );

        if( l==r && l==maxDeep ) ans=root;
        return Math.max(l,r);

    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        maxDeep=0;
        ans =null;
        find(0,root,root);
        return ans;
    }
}