class MinStack {
    private Stack<Integer> mainStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public MinStack() {

    }
    
    public void push(int value) {
        mainStack.push(value);

        if(minStack.isEmpty() || value <= minStack.peek()){
            minStack.push(value);
        }

    }
    
    public void pop() {
        if(mainStack.isEmpty()){
            return;
        }

        if(mainStack.peek().equals(minStack.peek())){
            minStack.pop();
        }

        mainStack.pop();
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */