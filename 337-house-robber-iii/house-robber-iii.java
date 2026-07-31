class Solution {
    public int rob(TreeNode root) {
        return robHelper(root, new HashMap<>());
    }

    private int robHelper(TreeNode root, Map<TreeNode, Integer> map) {
        if (root == null) return 0;

        if (map.containsKey(root)) return map.get(root);

        int take = root.val;
        if (root.left != null) {
            take += robHelper(root.left.left, map) + robHelper(root.left.right, map);
        }
        if (root.right != null) {
            take += robHelper(root.right.left, map) + robHelper(root.right.right, map);
        }

        int ntake = robHelper(root.left, map) + robHelper(root.right, map);

        int maxMoney = Math.max(take, ntake);
        map.put(root, maxMoney);

        return maxMoney;
    }
}