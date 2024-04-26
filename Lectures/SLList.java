public class SLList {

    public static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n){
            item = i;
            next = n;
        }
    }

    private IntNode sentinel;
    private int size;

    // constructor
    public SLList(int x){
        // item = x
        // next = null
        sentinel = new IntNode(0, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    // constructor: create an empty list
    public SLList(){
        sentinel = new IntNode(0, null);
        size = 0;
    }

    /** Adds an item to the front of the list. */
    public void addFirst(int x){
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    /** Retrieves the front item from the list */
    public int getFirst(){
        return sentinel.next.item;
    }

    /** Add an item to the end of the list */
    public void addLast(int x){
        IntNode p = sentinel;
        while(p.next != null){
            p = p.next;
        }
        p.next = new IntNode(x, null);
        size += 1;
    }

    /*
    public int size(IntNode p){
        if(p.next == null){
            return 1;
        }
        return 1 + size(p.next);
    }

    public int size(){
        return size(first);
        // => s.size();
    }
    */

    public int size(){
        return size;
    }
}
