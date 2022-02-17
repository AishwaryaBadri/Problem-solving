/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteNodes(ListNode head, int m, int n) {
    
    ListNode previous=null;
    ListNode current=head;
   
    while(current!=null)
    {
         int i=m;
        int j=n;
        while(current!=null && i-- > 0)
        {
            previous=current;
            current=current.next;
        }
        while(current!=null && j-- >0)
        {
            
            current=current.next;
        }
        
        previous.next=current;
        
    }
        return head;

    }
}