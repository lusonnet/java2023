/**
 * @ClassName: demo3
 * @Description: offer24
 * @author: sonnet
 * @date: 2023/2/27 23:41
 */


import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    Stack<ListNode> s1;
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        s1 = new Stack<>();
        while(head != null){
            s1.push(head);
            head = head.next;
        }
        ListNode newhead = s1.pop();
        ListNode tailnode = newhead;
        while(!s1.isEmpty()){
            ListNode cur = s1.pop();
            tailnode.next = cur;
            tailnode = cur;
        }
        tailnode.next = null;
        return newhead;
    }

}
