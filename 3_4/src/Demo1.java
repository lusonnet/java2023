/**
 * @ClassName: Demo1
 * @Description: 链表内指定区间反转
 * @author: sonnet
 * @date: 2023/3/4 14:35
 */


import java.util.*;

  class ListNode {
    int val;
    ListNode next = null;
  }

public class Demo1 {
    /**
     *
     * @param head ListNode类
     * @param m int整型
     * @param n int整型
     * @return ListNode类
     */
    public ListNode reverseBetween (ListNode head, int m, int n) {
        // write code here
        if(head.next == null) {return head;}
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode pre = node;
        ListNode cur = head;
        for(int i = 1;i < m;i++){
            pre = cur;
            cur = cur.next;
        }
        for(int i = 0;i < n - m;i++){
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = pre.next;
            pre.next = temp;
        }
        return node.next;


    }
}
