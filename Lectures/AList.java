/** Array based list.
 *  @author Josh Hug
 */

public class AList<Item> implements List61B<Item>{
    Item[] item;
    int size;

    int maxSize = 100;

    /** Creates an empty list. */
    public AList() {
        item = (Item[]) new Object[maxSize];
        size = 0;
    }

    @Override
    public void addFirst(Item x) {
        insert(x, 0);
    }

    @Override
    /** Inserts X into the back of the list. */
    public void addLast(Item x) {
        if(size == maxSize){
            maxSize *= 2;
            Item[] temp = (Item[]) new Object[maxSize];
            System.arraycopy(item,0,temp, 0, size);
            item = temp;
        }
        item[size++] = x;
    }

    @Override
    public Item getFirst() {
        if(size > 0){
            return item[0];
        }
        return null;
    }

    @Override
    /** Returns the item from the back of the list. */
    public Item getLast() {
        return item[size-1];
    }

    @Override
    /** Deletes item from back of the list and
     * returns deleted item. */
    public Item removeLast() {
        size--;
        return item[size];
    }

    @Override
    /** Gets the ith item in the list (0 is the front). */
    public Item get(int i) {
        return item[i];
    }

    @Override
    public void insert(Item x, int position) {
        addLast(x);
        for(int i = position; i < size; i++){
            item[i+1] = item[i];
        }
        item[position] = x;
    }

    @Override
    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }



} 