package LectureTest;

public class Sort {
    /** Sorts strings destructively. */
    public static void sort(String[] x) {
        sort(x, 0);
    }

    private static void sort(String[] x, int start){
        // don't need to sort the last item
        if (start == x.length - 1){
            return;
        }
        // find the smallest value
        int smallest = findSmallest(x, start);
        // move it to the front
        swap(x, smallest, start);
        // selection sort the rest
        sort(x, start + 1);
    }

    // Return the smallest string in x
    public static int findSmallest(String[] x, int start){
        int smallest = start;
        for(int i = start + 1; i < x.length; i += 1){
            int cmp = x[i].compareTo(x[smallest]);
            if (cmp < 0){
                smallest = i;
            }
        }
        return smallest;
    }

    // move the item to the front
    public static void swap(String[] x, int a, int b){
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }
}
