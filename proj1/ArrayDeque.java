/**
 * Created by hp on 2017/7/3.
 */
public class ArrayDeque <Item>{
    /** Array based list.
     *  @author Josh Hug
     */

    Item[] items;
    int size;
    int front=0;
    int rear=1;

    /** Creates an empty list. */
    public ArrayDeque() {
        size=0;
        items=(Item[]) new Object[8];
    }
    public void resize(int capacity){


    }
    /** Adds an item to the front of the Deque.*/
    public void addFirst(Item item){
        if(size==items.length)
            resize(size*2);
        if(front==-1)
            front=items.length-1;
        items[front]=item;
        front--;
        size++;
    }


    /**  Adds an item to the back of the Deque. */
    public void addLast(Item item){
        if(size==items.length)
            resize(size*2);
        if(rear==items.length)
            rear=0;
        items[rear]=item;
        rear++;
        size++;

    }

    /** Returns true if deque is empty, false otherwise. */
    public boolean isEmpty(){
        if(size==0)
            return true;
        else
            return false;
    }


    /** Returns the number of items in the Deque. */
    public int size() {
        return size;
    }

    /** Prints the items in the Deque from first to last, separated by a space. */
    public void printDeque(){
        int i=0;
        for(i=front+1;i<items.length && i!=rear+1;i++)
            System.out.println(items[i]);
        if(i-1==rear)
            return;
        if(i==items.length){
            for(i=0;i<rear;i++)
                System.out.println(items[i]);
        }

    }






}
