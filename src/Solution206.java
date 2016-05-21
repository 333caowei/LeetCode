/**
 * Created by caowei on 16/5/20.
 */
public class Solution206 {

    public static void main(String args[]){
        Solution206 solution206 = new Solution206();

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        ListNode head = solution206.reverseList(listNode1);
        System.out.println(head.val);
        System.out.println(head.next.val);
        System.out.println(head.next.next.val);
        System.out.println(head.next.next.next.val);

    }


    /**
     * 创建一个新的链表,是倒序的
     */
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }


        int length=0;
        ListNode currentNode = head;
        while(true){
            if(currentNode.next!=null){
                currentNode = currentNode.next;
                length++;
            }else{
                break;
            }
        }



        ListNode newNode = new ListNode(currentNode.val);
        ListNode firstNode = newNode;
        for(int i=0;i<length;i++){
            int value = getNodeValue(head, length-i);
            newNode.next = new ListNode(value);
            newNode = newNode.next;
        }


        return firstNode;
    }


    public int getNodeValue(ListNode head, int n) {
        for(int i=1;i<n;i++){
            head = head.next;
        }
        return head.val;
    }








//    /**
//     * 解析答案
//     */
//    public ListNode reverseList(ListNode head) {
//
//        ListNode pre     = null;
//        ListNode current = head;
//        while(current!=null){
//            ListNode next_temp = current.next;
//            current.next = pre;
//            pre = current;
//            current = next_temp;
//        }
//        return pre;
//    }








    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
