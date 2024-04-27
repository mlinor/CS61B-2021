public class SLList<Item> implements List61B<Item>{

    public static class ItemNode<Item> {
        public Item item;
        public ItemNode next;

        public ItemNode(Item x, ItemNode n){
            item = x;
            next = n;
        }
    }

    private ItemNode sentinel;
    private int size;

    // constructor
    public SLList(Item x){
        // item = x
        // next = null
        sentinel = new ItemNode<Item>(null, null);
        sentinel.next = new ItemNode<Item>(x, null);
        size = 1;
    }

    // constructor: create an empty list
    public SLList(){
        sentinel = new ItemNode<Item>(null, null);
        size = 0;
    }

    @Override
    /** Adds an item to the front of the list. */
    public void addFirst(Item x){
        sentinel.next = new ItemNode<Item>(x, sentinel.next);
        size += 1;
    }

    @Override
    /** Add an item to the end of the list */
    public void addLast(Item x){
        ItemNode p = sentinel;
        while(p.next != null){
            p = p.next;
        }
        p.next = new ItemNode(x, null);
        size += 1;
    }

    @Override
    /** Retrieves the front item from the list */
    public Item getFirst(){
        return (Item) sentinel.next.item;
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

    @Override
    public Item getLast() {
        ItemNode p = sentinel;
        while (p.next != null){
            p = p.next;
        }
        return (Item) p.item;
    }

    @Override
    public Item removeLast() {
        ItemNode pre = sentinel;
        ItemNode p = sentinel;
        while (p.next != null){
            p = p.next;
            pre = p;
        }
        pre.next = null;
        size--;
        return (Item) p.item;
    }

    @Override
    public Item get(int i) {
        int count = 0;
        ItemNode p = sentinel;
        while(count < i){
            p = sentinel.next;
            count++;
        }
        return (Item) p;
    }

    @Override
    public void insert(Item x, int position) {
        int count = 0;
        ItemNode p = sentinel;
        while(count < position - 1){
            p = p.next;
            count++;
        }
        ItemNode temp = p.next;
        p.next = new ItemNode<Item>(x, temp);
        size++;
    }

    @Override
    public int size(){
        return size;
    }
}
