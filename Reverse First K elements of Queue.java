class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Vector<Integer> vec=new Vector<>();
        int remaining = q.size()-k;
        
        while(k>0){
            vec.add(q.peek());
            q.remove();
            k--;
        }
        
        Collections.reverse(vec);
        
        for(int i=0;i<vec.size();i++){
            q.add(vec.get(i));
        }
        
        while(remaining>0){
            q.add(q.peek());
            q.remove();
            remaining--;
        }
        return q;
    }
}
