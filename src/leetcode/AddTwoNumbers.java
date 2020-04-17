package leetcode;


public class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) { 
    }
    public  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0) ;
        ListNode current = dummyHead;
        int carry = 0;
        while(l1 != null || l2 != null){
            if(l1 != null){
                carry += l1.val;
                l1 =l1.next;
            }
            if(l2 != null){
                carry += l2.val;
                l2 =l2.next;
            }
            current.next = new ListNode(carry % 10);
            current= current.next;
            carry = carry / 10;
        }
        if(carry > 0){
            current.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

}

