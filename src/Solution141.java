import java.util.HashSet;

/**
 * Created by caowei on 16/5/30.
 */
public class Solution141 {

    public static void main(String args[]){
        Solution141 solution141 = new Solution141();

        ListNode listNode0 = new ListNode(0);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);

        listNode0.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode2;


        boolean hasCycle = solution141.hasCycle(listNode0);
        System.out.print(hasCycle);
    }


    public boolean hasCycle(ListNode head) {
        //两个特殊值,null和一个节点
        if(head==null){
            return false;
        }
        //两个特殊值,null和一个节点
        if(head.next==null){
            return false;
        }

        //将遍历过的保存在hashet
        HashSet<ListNode> hashSet = new HashSet<ListNode>();
        head = head.next;
        while(true){
            if(head.next==null){
                return false;
            }else{
                if(hashSet.contains(head)){
                    return true;
                }else{
                    hashSet.add(head);
                    head = head.next;
                }
            }
        }

    }



    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
