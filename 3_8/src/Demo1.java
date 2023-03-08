/**
 * @ClassName: Demo1
 * @Description: 删除链表的倒数第n个结点
 * @author: sonnet
 * @date: 2023/3/8 17:54
 */


public class Demo1 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        for(int i = 0; i < n;i++ ){
            if(fast.next == null){
                return head.next;
            }
            fast = fast.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

