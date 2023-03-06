/**
 * @ClassName: Demo1
 * @Description: 合并两个排序链表
 * @author: sonnet
 * @date: 2023/3/6 23:41
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Demo1 {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;

            } else {
                cur.next = list2;
                list2 = list2.next;

            }
            cur = cur.next;
        }
        if (list1 != null) {

            cur.next = list1;
            list1 = list1.next;
        }
        if (list2 != null) {
            cur.next = list2;
            list2 = list2.next;
        }


        return head.next;
    }
}
