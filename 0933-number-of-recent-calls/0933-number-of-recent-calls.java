class RecentCounter {
    //  Initailize the Queue
    Queue<Integer> q;   
    public RecentCounter() {
        q=new ArrayDeque<>();   
    }
    
    public int ping(int t) {
        // step 1-> Pushing the element (timestamp) in the Queue 
        q.offer(t);

        // step 2->  Removing the Invalid timeStamp that does't occur in the range i.e. [t-3000, t]
        while(!q.isEmpty() && q.peek()<t-3000){
            // removal;
            q.poll();
        }

        // step 3->  Now returing the Answer i.e. q.size();
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */