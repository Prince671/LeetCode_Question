class BrowserHistory {
    Deque<String> currentHistory=new ArrayDeque<>();
    Deque<String> forwardHistory=new ArrayDeque<>();


    public BrowserHistory(String homepage) {
        currentHistory=new ArrayDeque<>();
        forwardHistory=new ArrayDeque<>();

        //intailly the homepage will be present in the CurrentHistory Stack
        currentHistory.push(homepage)    ;
    }
    
    public void visit(String url) {

        currentHistory.push(url);
        while(!forwardHistory.isEmpty())        {
        forwardHistory.pop();
        }
    }
    
    public String back(int steps) {
        while(steps>0){
            if(currentHistory.size()>1){
                String removedTab=currentHistory.pop();
                forwardHistory.push(removedTab);
            }else{
                break;
            }
            steps--;
        }
        return currentHistory.peek();
    }

    
    public String forward(int steps) {
        while(steps>0){
            if(forwardHistory.size()>=1){
                String getForwardTab=forwardHistory.pop();
                currentHistory.push(getForwardTab);
            }else{
                break;
            }
            steps--;
        }
        return currentHistory.peek();
    }
}

/**
 * Your BrowserHispry object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */