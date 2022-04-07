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
  public List<Integer> preorderTraversal(TreeNode root) {
    LinkedList<TreeNode> stack = new LinkedList<>();
    LinkedList<Integer> output = new LinkedList<>();
    if (root == null) {
      return output;
    }
    
      stack.add(root);
    while( !stack.isEmpty())
    {
        output.add(root.val);
        if(root.right!=null)
        {
            // root= root.right;
            stack.push(root.right);
           
        }
        if(root.left!=null)
        {
            // root= root.left;
            stack.push(root.left);
           
        }
        root=stack.pop();
       
        
    }
  
   
      
      return output;
  }
}

