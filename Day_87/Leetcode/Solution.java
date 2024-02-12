class Solution {
    int K;
    int ans;
    boolean flag;
    public void helper(TreeNode root, int k){
        if (root == null){
            return;
        }
        
        helper(root.left, k);
        if (K == 1 && !flag){
            ans = root.val;
            flag = true;
            return;
        }

        K--;
        if (!flag){
            helper(root.right, k);
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        K = k;
        flag = false;
        ans = 0;
        helper(root, k);
        if (flag){
            return ans;
        }

        return -1;
    }
}
