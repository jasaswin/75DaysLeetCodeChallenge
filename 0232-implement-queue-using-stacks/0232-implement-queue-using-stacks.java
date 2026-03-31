import java.util.Stack;

class MyQueue {

    private Stack<Integer> input;
    private Stack<Integer> output;

    // Constructor
    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    // Push element to back
    public void push(int x) {
        input.push(x);
    }

    // Pop element from front
    public int pop() {
        shiftStacks();
        return output.pop();
    }

    // Peek front element
    public int peek() {
        shiftStacks();
        return output.peek();
    }

    // Check if empty
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    // Helper function to transfer elements
    private void shiftStacks() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
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