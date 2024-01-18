class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode tempNode = new ListNode(0);
        tempNode.next = head;
        ListNode tempHead = head;
        ListNode prev = tempNode;
        while(tempHead!=null){
            ListNode klast = tempHead;
            int num = k;
            while(num>0 && tempHead!=null){
                tempHead = tempHead.next;
                num--;
            }
            if(num!=0) {
                prev.next = klast;
                break;
            }
            ListNode kstart = reverse(klast,k);
            prev.next = kstart;
            prev = klast; 
        }
        return tempNode.next;
        
    } 
    public ListNode reverse(ListNode head, int k){
        ListNode prev = null;
        while(head!=null && k>0){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
            k--;
        }
        return prev;
    }
    
}
