/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
 
  public void preorder(Node root,List<Integer> answer) {
      if(root==null)
      {
          return;
      }
      answer.add(root.val);
    for(Node node: root.children)
    {
        preorder(node,answer);
    }
  }
    
    
     public List<Integer> preorder(Node root) {
        List<Integer> answer=new ArrayList<Integer>();
         
         preorder(root,answer);
        
         return answer;
        
        
    }
    
}