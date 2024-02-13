class MinStack {
    Stack<Integer>stack;
    Stack<Integer> minStack;
    int min ;
    public MinStack() {
       minStack = new Stack();
        stack=new Stack();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
    
        stack.push(val);
        if(val<=min){
            min=val;
            minStack.push(val);
        }

        
    }
    
    public void pop() {
        int pop = stack.pop();
        if(pop==min){
            minStack.pop();
            if(minStack.isEmpty()){
                min = Integer.MAX_VALUE;
            }
            else{
                min = minStack.peek();
            }

        }
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
      
        return min;
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */