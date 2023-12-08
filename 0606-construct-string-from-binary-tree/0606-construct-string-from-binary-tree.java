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
    public static String find( TreeNode root,String str ) {
        if( root == null ) return str;
    
       str += String.valueOf(root.val);
       if( root.left != null || root.right != null ) {
           str += "(";
           str = find( root.left,str ) + ")" ;
       }
       if( root.right != null ) {
           str += "(";
           str = find( root.right,str ) + ")" ;
       }
        return str ;
    }
    public String tree2str(TreeNode root) {
        
        return find( root,"" );
         
    }
}