class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {       
        List<List<Integer>> a=new ArrayList<>();
        Queue<TreeNode>  q=new LinkedList<>();
        if(root==null) return a;
        q.add(root);
        int level=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            level++;
            LinkedList<Integer> a1=new LinkedList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=q.remove();
        if (level % 2 != 0) {
        a1.add(curr.val);}  
        else
        a1.addFirst(curr.val); 
    if (curr.left != null) q.add(curr.left);
    if (curr.right != null) q.add(curr.right); 
        }
            a.add(a1);
        }
return a;
        
    }}
