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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        find(0, root, ans);
        return ans;
    }

    private void find(int lvl, TreeNode root, List<List<Integer>> ans) {
        if (root == null) return;

        if (ans.size() <= lvl) {
            ans.add(new ArrayList<>());
        }

        if (lvl % 2 == 0) {
            ans.get(lvl).add(root.val);
        } else {
            ans.get(lvl).add(0, root.val);
        }

        find(lvl + 1, root.left, ans);
        find(lvl + 1, root.right, ans);
    }
}