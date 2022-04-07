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
/*public class Solution {
    
    public void inorderTraversal(TreeNode root)
    {
      List<Integer> answer = new ArrayList<>();
        Stack<Treenode> stack= new LinkedList<>();
        
       Treenode node=root;
        
        while(node!=null || !stack.isEmpty())
        {
            
            while(node!=null)
            {
                stack.push(node);
                node=node.left;
                
            }
           
            node=stack.pop;
             answer.add(node.val);
            node=node.right;
         
            
        }
       
    return answer;
}
    
}*/



public class Solution {
    
        public void inorderTraversal(TreeNode root,List<Integer> answer) 
        {
            if(root==null)
            {
                return;
            }
            inorderTraversal(root.left,answer);
            answer.add(root.val);
            inorderTraversal(root.right,answer);

        }



        public List<Integer> inorderTraversal(TreeNode root) 
        {
            List<Integer> answer = new ArrayList<>();
            inorderTraversal(root,answer);
            return answer;
        }

    }
