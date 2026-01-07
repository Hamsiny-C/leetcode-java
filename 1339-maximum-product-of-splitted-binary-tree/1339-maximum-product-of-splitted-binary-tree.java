class Solution {

    long maxproduct = 0;
    long totalsum = 0;
    int mod = 1000000007;

    public int maxProduct(TreeNode root) {

        // Step 1: calculate total sum
        totalsum = findtotalsum(root);

        // Step 2: calculate max product
        findsubtree(root);

        return (int)(maxproduct % mod);
    }

    private long findtotalsum(TreeNode node) {
        if (node == null)
            return 0;

        return node.val
                + findtotalsum(node.left)
                + findtotalsum(node.right);
    }

    private long findsubtree(TreeNode node) {
        if (node == null)
            return 0;

        long left = findsubtree(node.left);
        long right = findsubtree(node.right);

        long subtree = node.val + left + right;

        long product = subtree * (totalsum - subtree);

        maxproduct = Math.max(maxproduct, product);

        return subtree;
    }
}
