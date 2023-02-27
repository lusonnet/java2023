/**
 * @ClassName: demo2
 * @Description: offer06
 * @author: sonnet
 * @date: 2023/2/27 23:24
 */


import java.util.Stack;




 class ListNode {
   int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }
class Solution {
    Stack<Integer> s1;
    public int[] reversePrint(ListNode head) {
        s1 = new Stack<>();
        while(head != null){
            s1.push(head.val);
            head = head.next;
        }
        int[] arr = new int[s1.size()];
        for(int i = 0;i < arr.length;i++){
            arr[i] = s1.pop();
        }
        return arr;
    }
}