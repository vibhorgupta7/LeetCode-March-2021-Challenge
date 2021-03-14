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
    public ListNode swapNodes(ListNode head, int k) {
    
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        
        int n=arr.size();
        int a=arr.get(k-1);
        int b=arr.get(n-k);
        
        arr.set(n-k,a);
        arr.set(k-1,b);
    

        ListNode h=null,tail=null,nn=null;
        for(int i=0;i<arr.size();i++){
             nn = new ListNode(arr.get(i));

            if(h==null){
                h=nn;
                tail=nn;
            }
            else{
                tail.next=nn;
                tail=tail.next;
            }
        }
        
        return h;
        
    }
}