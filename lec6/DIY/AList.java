/** Array based list.
 *  @author Josh Hug
 */

public class AList {
    int[] items;
    int size;

    /** Creates an empty list. */
    public AList() {
        size=0;
        items=new int[100];
    }
    public void resize(int capacity){

        int[] newArray=new int[capacity];
        System.arraycopy(items,0,newArray,0,size);
        items=newArray;
    }

    /** Inserts X into the back of the list. */
    public void insertBack(int x) {
        if(size==items.length)
            resize(size*2);
        items[size]=x;
        size++;

    }

    /** Returns the item from the back of the list. */
    public int getBack() {
        return items[size-1];        
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return items[i];        
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public int deleteBack() {
        int itemDeleted=getBack();
        items[size-1]=0;
        size--;
        return itemDeleted;
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;        
    }

} 