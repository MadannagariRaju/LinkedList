class Node{
    String data;
    Node prev,next;
    Node(String data) {
        this.data = data;
        prev = null;
        next = null;
    }
}

class BrowserHistory {
    Node current = null;
    public BrowserHistory(String homepage) {
        current = new Node(homepage);
    }
    
    public void visit(String url) {
        Node newnode = new Node(url);
        current.next = newnode;
        newnode.prev = current;
        current = newnode;
    }
    
    public String back(int steps) {
        while(current.prev != null && steps > 0) {
            current = current.prev;
            steps--;
        }
        return current.data;
    }
    
    public String forward(int steps) {
        while(current.next != null && steps>0) {
            current = current.next;
            steps--;
        }
        return current.data;
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */