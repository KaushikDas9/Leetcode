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

   static int value,height;

    public static int find( TreeNode root , int left ) { 

        if( root == null ) return 0 ;

        if( left > height ) { 
            height  = left ;
            value = root.val;
        }
        
        int left1  = 1 + find( root.left , left+1 ) ;
        int right = find( root.right, left+1 );

        

        return Math.max( left1,right );

    }

    public int findBottomLeftValue(TreeNode root) {

        value =-1;
        height=-1;

        find( root,0 );
        return value ;
        
    }
}