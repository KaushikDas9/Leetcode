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
    // Class to store a node, its horizontal distance, and its depth
    static class Pair {
        TreeNode node;
        int hd; // horizontal distance
        int depth; // depth of the node

        Pair(TreeNode node, int hd, int depth) {
            this.node = node;
            this.hd = hd;
            this.depth = depth;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        // Queue for level-order traversal
        Queue<Pair> q = new LinkedList<>();
        // Map to store nodes at each horizontal distance
        Map<Integer, List<Pair>> map = new HashMap<>();

        // Start with the root node at horizontal distance 0 and depth 0
        q.add(new Pair(root, 0, 0));

        while (!q.isEmpty()) {
            Pair pair = q.poll();
            TreeNode node = pair.node;
            int hd = pair.hd;
            int depth = pair.depth;

            // Add the current node to the map
            map.computeIfAbsent(hd, k -> new ArrayList<>()).add(pair);

            // Add left child to the queue with horizontal distance - 1 and depth + 1
            if (node.left != null) {
                q.add(new Pair(node.left, hd - 1, depth + 1));
            }

            // Add right child to the queue with horizontal distance + 1 and depth + 1
            if (node.right != null) {
                q.add(new Pair(node.right, hd + 1, depth + 1));
            }
        }

        // Sort the map by horizontal distance
        List<Integer> sortedHds = new ArrayList<>(map.keySet());
        Collections.sort(sortedHds);

        // Build the result
        for (int hd : sortedHds) {
            List<Pair> pairs = map.get(hd);
            // Sort pairs by depth and then by node value
            pairs.sort((a, b) -> {
                if (a.depth == b.depth) {
                    return a.node.val - b.node.val;
                }
                return a.depth - b.depth;
            });

            // Extract node values in sorted order
            List<Integer> column = new ArrayList<>();
            for (Pair p : pairs) {
                column.add(p.node.val);
            }
            ans.add(column);
        }

        return ans;
    }
}