/**
 * 没做出来
 */
public class Solution_2 {

    public static void main(String[] args) {
        Solution_2 solution_2 = new Solution_2();

        ListNode l11 = new ListNode(9);

        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(9);
        ListNode l23 = new ListNode(9);
        ListNode l24 = new ListNode(9);
        ListNode l25 = new ListNode(9);
        ListNode l26 = new ListNode(9);
        ListNode l27 = new ListNode(9);
        ListNode l28 = new ListNode(9);
        ListNode l29 = new ListNode(9);
        ListNode l210 = new ListNode(9);
        l21.next = l22;
        l22.next = l23;
        l23.next = l24;
        l24.next = l25;
        l25.next = l26;
        l26.next = l27;
        l27.next = l28;
        l28.next = l29;
        l29.next = l210;

        solution_2.addTwoNumbers(l11,l21);
    }





    /*这个方法就是将链表中的数字串起来，当做一个long，例如2->4->5,
    可以根据题目具体要求转化成long型的245或542，再做后续的操作，就很容易了。
     */

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //获取链表长度
        long a = 0;
        long rate = 1;
        while(true){
            a+=l1.val*rate;
            rate*=10;
            if(l1.next==null){
                break;
            }
            l1 = l1.next;
        }

        long b = 0;
        rate = 1;
        while(true){
            b+=l2.val*rate;
            rate*=10;
            if(l2.next==null){
                break;
            }
            l2 = l2.next;
        }

        long sum = a+b;
        int length = (sum+"").length();

        ListNode answer[] = new ListNode[length];


        for(int i=0;i<length;i++){
            answer[i] = new ListNode((int)(sum%10));
            sum = sum/10;
        }

        for(int i=0;i<length;i++){
            if(i<length-1){
                answer[i].next = answer[i+1];
            }
        }

        ListNode temp = answer[0];
        while(temp.next!=null){
            System.out.print(temp.val);
            temp  =temp.next;

        }
        return  answer[0];
    }

}



class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

