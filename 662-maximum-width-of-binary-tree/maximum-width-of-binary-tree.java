

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        // Map to store the leftmost position at each level
        Map<Integer, Integer> leftmostPositions = new HashMap<>();

        // Start DFS traversal
        return find(root, 0, 0, leftmostPositions);
    }

    private int find(TreeNode root, int depth, int position, Map<Integer, Integer> leftmostPositions) {
        if (root == null) return 0;

        // If this is the first node at the current depth, record its position
        leftmostPositions.putIfAbsent(depth, position);

        // Calculate the width of the current level
        int levelWidth = position - leftmostPositions.get(depth) + 1;

        // Recursively calculate the width for the left and right subtrees
        int leftWidth = find(root.left, depth + 1, 2 * position, leftmostPositions);
        int rightWidth = find(root.right, depth + 1, 2 * position + 1, leftmostPositions);

        // Return the maximum width found so far
        return Math.max(levelWidth, Math.max(leftWidth, rightWidth));
    }
}