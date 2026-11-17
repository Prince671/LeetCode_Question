class MyQueue {
    Deque<Integer> st;

    static int getPeekElement(Deque<Integer> st){
        if(st.size()==1){
            return st.peek();
        }
        int x=st.pop();
        int last=getPeekElement(st);
        st.push(x);

        return last;
    }

    static int deleteFromBottom(Deque<Integer> st){
        if(st.size()==1){
            return st.pop();
        }
        int x=st.pop();
        int last=deleteFromBottom(st);
        st.push(x);

        return last;
    }
    
    public MyQueue() {
        st=new ArrayDeque<>();
    }
    
    public void push(int x) {
        
            st.push(x);
        
    }
    
    public int pop() {
        return deleteFromBottom(st);
        
    }
    
    public int peek() {
        return getPeekElement(st);
    }
    
    public boolean empty() {
        return st.size()==0;
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