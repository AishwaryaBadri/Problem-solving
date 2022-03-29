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
    
    public void postorderTraversal(TreeNode root,  List<Integer> answer)
    {
        if(root==null)
        {
            return;
        }
        postorderTraversal(root.left,answer);
        postorderTraversal(root.right,answer);
        answer.add(root.val);
    }
    
    
    
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> answer= new ArrayList<Integer>();
        postorderTraversal(root,answer);
        return answer;
        
    }
}