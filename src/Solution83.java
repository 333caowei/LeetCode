/**
 * Created by caowei on 16/5/28.
 */
public class Solution83 {

    public static void main(String args[]){
        Solution83 solution83 = new Solution83();

        ListNode listNode0 = new ListNode(1);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(3);

        listNode0.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        ListNode listNodeResult = solution83.deleteDuplicates(listNode0);

        while(true){
            if(listNodeResult!=null){
                System.out.print(listNodeResult.val);
                listNodeResult = listNodeResult.next;
            }else{
                break;
            }
        }

    }


    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return  head;
        }
        ListNode current = head;
        while(true){
            if(current.next!=null && current.val==current.next.val){
                current.next = current.next.next;
            }else if(current.next==null){
                break;
            }else{
                current = current.next;
            }
        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
