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
    // Class to store a node and its horizontal distance
    static class Pair {
        TreeNode node;
        int hd; // horizontal distance

        Pair(TreeNode node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        // Queue for level-order traversal
        Queue<Pair> q = new LinkedList<>();
        // Map to store nodes at each horizontal distance
        Map<Integer, List<Integer>> map = new TreeMap<>();

        // Start with the root node at horizontal distance 0
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            int size = q.size();
            // Temporary map to store nodes at the current level
            Map<Integer, List<Integer>> tempMap = new HashMap<>();

            for (int i = 0; i < size; i++) {
                Pair pair = q.poll();
                TreeNode node = pair.node;
                int hd = pair.hd;

                // Add the current node's value to the temporary map
                tempMap.computeIfAbsent(hd, k -> new ArrayList<>()).add(node.val);

                // Add left child to the queue with horizontal distance - 1
                if (node.left != null) {
                    q.add(new Pair(node.left, hd - 1));
                }

                // Add right child to the queue with horizontal distance + 1
                if (node.right != null) {
                    q.add(new Pair(node.right, hd + 1));
                }
            }

            // Sort nodes at the same horizontal distance and add them to the main map
            for (Map.Entry<Integer, List<Integer>> entry : tempMap.entrySet()) {
                int hd = entry.getKey();
                List<Integer> nodes = entry.getValue();
                Collections.sort(nodes); // Sort nodes at the same hd
                map.computeIfAbsent(hd, k -> new ArrayList<>()).addAll(nodes);
            }
        }

        // Add the values from the map to the result list in sorted order of horizontal distance
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }

        return ans;
    }
}