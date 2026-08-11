class Node{
      int key;
      int value;
      Node prev;
      Node next;
      Node(int key,int value){
        this.key=key;
        this.value=value;
      }
}
class LRUCache {
       HashMap<Integer,Node> map;
       int capacity; 
       Node head;
       Node tail;
       
       


    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.map=new HashMap<>();
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
       tail.prev=head;
    }
    private void addNode(Node node){
    node.next=head.next;
    node.prev=head;
    head.next.prev=node;
    head.next=node;
    }
    private void removeNode(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    public int get(int key) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            removeNode(node);
            addNode(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.value=value;
            removeNode(node);
            addNode(node);
            return;
            
        }
        Node node=new Node(key,value);
        map.put(key,node);
        addNode(node);
    if(map.size()>capacity){
        map.remove(tail.prev.key);
        removeNode(tail.prev);
    }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */