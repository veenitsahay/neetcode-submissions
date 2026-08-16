class MinStack {

    MinStack stack = null;
    Deque<Integer> deq = null;

    public MinStack() {
        deq = new ArrayDeque<>();
    }
    
    public void push(int val) {
        deq.add(val);
    }
    
    public void pop() {
        deq.removeLast();
    }
    
    public int top() {
      return  deq.getLast();
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        Iterator<Integer> itr = deq.iterator();
        while( itr.hasNext() ){
            min = Math.min(min, itr.next());
        }
        return min;
    }
}
