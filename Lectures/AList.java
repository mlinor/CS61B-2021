/** Array based list.
 *  @author Josh Hug
 */

public class AList {
    int[] item;
    int size;

    int maxSize = 100;

    /** Creates an empty list. */
    public AList() {
        item = new int[maxSize];
        size = 0;
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        if(size == maxSize){
            maxSize *= 2;
            int[] temp = new int[maxSize];
            System.arraycopy(item,0,temp, 0, size);
            item = temp;
        }
        item[size++] = x;
    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return item[size-1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return item[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
     * returns deleted item. */
    public int removeLast() {
        size--;
        return item[size];
    }
} 