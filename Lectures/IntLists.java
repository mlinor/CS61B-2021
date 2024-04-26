public class IntLists {
    public int first;
    public IntLists rest;

    public IntLists(int f, IntLists r){
        first = f;
        rest = r;
    }

    /** get back the number of items */
    public int size(){
        if(rest == null){
            return 1;
        }
        return 1 + this.rest.size();
    }

    /** Return the size of the list using no recursion*/
    public int iterativeSize(){
        IntLists p = this;
        int totalSize = 0;
        while(p != null){
            totalSize += 1;
            p = p.rest;
        }
        return totalSize;
    }

    // get the ith item of the list
    public int get(int i){
        if (i == 0){
            return first;
        }
        return rest.get(i-1);
    }
}
