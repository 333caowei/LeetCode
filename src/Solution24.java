/**
 * Created by caowei on 16/6/1.
 */
public class Solution24 {

    public static void main(String args[]){
        Solution24 solution24 = new Solution24();

        ListNode listNode0 = new ListNode(1);
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(5);

        listNode0.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        ListNode listNodeResult = solution24.swapPairs(listNode0);

        while(true){
            if(listNodeResult!=null){
                System.out.print(listNodeResult.val);
                listNodeResult = listNodeResult.next;
            }else{
                break;
            }
        }

    }

    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return null;
        }else if(head!=null && head.next==null){
            return head;
        }
        ListNode returnNode = head.next;
        ListNode current = head;
        while(true){
            ListNode temp = current.next;
            current.next = current.next.next;
            temp.next = current;
            if(current.next!=null && current.next.next!=null){
                current = current.next;
                temp    = temp.next;
                temp.next = current.next;
            }else{
                break;
            }
        }

        return returnNode;

    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
