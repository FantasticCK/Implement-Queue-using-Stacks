package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class MyQueue {
    Stack<Integer> s;
    Stack<Integer> temp;

    /** Initialize your data structure here. */
    public MyQueue() {
        s = new Stack<>();
        temp = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while(!s.isEmpty())
            temp.push(s.pop());
        s.push(x);
        while(!temp.isEmpty())
            s.push(temp.pop());
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return s.pop();
    }

    /** Get the front element. */
    public int peek() {
        return s.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */