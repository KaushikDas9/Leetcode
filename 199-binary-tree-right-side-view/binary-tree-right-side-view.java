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

    public static void find( int lvl , TreeNode root , List<Integer> ans ) { 

        if( root == null ) return;

        

        if (lvl == ans.size()) {
            ans.add(root.val);
        } else {
            ans.set(lvl, root.val);
        }

        find( lvl + 1 , root.left , ans );
        find( lvl + 1 , root.right , ans );

    }
    public List<Integer> rightSideView(TreeNode root) {
        

        List<Integer> ans = new ArrayList<>();
        find( 0 ,root,ans );
        return ans;

    }
}