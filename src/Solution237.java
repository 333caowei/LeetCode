/**
 * Created by caowei on 16/5/17.
 */
public class Solution237 {

    public static void main(String args[]){
        Solution237 solution237 = new Solution237();

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        solution237.deleteNode(listNode3);
    }


    /**
     * 当前节点的值等于下一个节点的值,然后当前节点指向下一个节点的下一个节点
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        if(node.next.next==null){
            node.next=null;
        }else{
            node.next=node.next.next;
        }
    }




    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
