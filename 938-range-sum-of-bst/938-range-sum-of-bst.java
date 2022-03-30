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
    public void rangeSumBST123(TreeNode root, int low, int high)
    {
      
        if(root==null)
        {
            return;
        }
        if( root.val >= low )
        {
            if( root.val <= high){
                sum=sum+root.val;
            }
                
        }
         rangeSumBST123(root.left,low,high);
        rangeSumBST123(root.right,low,high);
       
       
    }
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        rangeSumBST123(root,low,high);
         
         return sum;
    }
}