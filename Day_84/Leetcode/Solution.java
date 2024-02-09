class Solution {
    List<List<Integer>> ans;
    void solve(TreeNode root, int lvl) {
        if(root == null) return;
        if(ans.size() == lvl) {
            ans.add(new ArrayList<>());
        }
        ans.get(lvl).add(root.val);
        solve(root.left, lvl + 1);
        solve(root.right, lvl + 1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        ans = new ArrayList<>();
        solve(root, 0);
        return ans;
    }
}
