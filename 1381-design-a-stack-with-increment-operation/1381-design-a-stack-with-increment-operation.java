class CustomStack {
    int[] stack;
    int top = -1, size = 0;
    public CustomStack(int maxSize) {
        if(top != maxSize)
        {
            size = maxSize;
            this.stack = new int[maxSize];
        }
    }
    
    public void push(int x) {
        if(top != size - 1)
            stack[++top] = x;
    }
    
    public int pop() {
        if(top != -1)
            return stack[top--];
        return -1;
    }
    
    public void increment(int k, int val) {
        int goTill = Math.min(k, top+1);
        for(int i = 0; i < goTill; i ++)
            stack[i] = stack[i] + val;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */