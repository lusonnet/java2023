import java.util.Stack;

/**
 * @ClassName: MinStack
 * @Description: offer30
 * @author: sonnet
 * @date: 2023/2/27 23:03
 */


class MinStack {

    Stack<Integer> s1;
    Stack<Integer> s2;
    /** initialize your data structure here. */
    public MinStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.add(x);
        if(s2.isEmpty() || s2.peek() >= x){
            s2.add(x);
        }
    }

    public void pop() {
        if(s1.pop().equals(s2.peek())){
            s2.pop();
        }

    }

    public int top() {
        return s1.peek();
    }

    public int min() {
        return s2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */