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
    int sum=0;
    
    
     public void rangeSumBST(TreeNode root, int low, int high,List<Integer> answer) {
         
         if(root==null)
         {
             return;
         }  
         if(root.val >=low  && root.val <= high)
         {
             sum=sum+root.val;
         }
         rangeSumBST(root.left,low,high,answer);
      //   answer.add(root.val);
          rangeSumBST(root.right,low,high,answer);
         
         
     }
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> answer=new ArrayList<Integer>();
        rangeSumBST(root,low,high,answer);
        return sum;
    }
}