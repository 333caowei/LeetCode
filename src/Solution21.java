/**
 * Created by caowei on 16/5/31.
 */
public class Solution21 {

    public static void main(String args[]){
        Solution21 solution21 = new Solution21();


        ListNode listNode1_1 = new ListNode(1);
        ListNode listNode1_2 = new ListNode(2);
        ListNode listNode1_3 = new ListNode(3);
        ListNode listNode1_4 = new ListNode(4);

        ListNode listNode2_1 = new ListNode(2);
        ListNode listNode2_2 = new ListNode(7);
        ListNode listNode2_3 = new ListNode(8);

        listNode1_1.next = listNode1_2;
        listNode1_2.next = listNode1_3;
        listNode1_3.next = listNode1_4;

        listNode2_1.next = listNode2_2;
        listNode2_2.next = listNode2_3;

        ListNode listNodeResult = solution21.mergeTwoLists(listNode1_1, listNode2_1);


        //print
        while(true){
            if(listNodeResult!=null){
                System.out.print(listNodeResult.val);
                listNodeResult = listNodeResult.next;
            }else{
                break;
            }
        }

    }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode head = listNode;
        while(true){
            if(l1!=null && l2!=null){
                if(l1.val<=l2.val){
                    listNode.next = new ListNode(l1.val);
                    listNode = listNode.next;
                    l1 = l1.next;
                }else if(l2.val<=l1.val){
                    listNode.next = new ListNode(l2.val);
                    listNode = listNode.next;
                    l2 = l2.next;
                }
            }else if(l1!=null && l2==null){
                listNode.next = new ListNode(l1.val);
                listNode = listNode.next;
                l1 = l1.next;
            }else if(l2!=null && l1==null){
                listNode.next = new ListNode(l2.val);
                listNode = listNode.next;
                l2 = l2.next;
            }else{
                break;
            }
        }
        return head.next;
    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
