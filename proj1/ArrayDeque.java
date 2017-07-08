/**
 * Created by hp on 2017/7/3.
 */
public class ArrayDeque <Item>{


    Item[] items;
    int size;
    int front;
    int rear;

    /** Creates an empty list. */
    public ArrayDeque() {
        size=0;
        items=(Item[]) new Object[8];
        front=-1;
        rear=0;
    }


    public void resize(int capacity){
        Item[] newArray=(Item[]) new Object[capacity];
        if(isEmpty()) {
            items = newArray;
            return;
        }
        int i;
        int j;
        if(size==items.length){
            for(i=front+1, j=0;i<items.length;i++,j++)
                newArray[j]=items[i];
            int jRecord=j;
            for(i=0,j=jRecord;i<=front;i++,j++)
                newArray[j]=items[i];

        }
        else if(front>=rear){
            for(i=front+1, j=0;i<items.length;i++, j++)
                newArray[j]=items[i];
            for(i=0;i<front;i++,j++)
                newArray[j]=items[i];
        }
        else if(front<rear){
            for(i=front+1, j=0;i<rear;i++,j++)
                newArray[j]=items[i];
        }
        items=newArray;

        front=-1;
        rear=size;
    }
    /** Adds an item to the front of the Deque.*/

    public void addFirst(Item item){
        if(front==-1 && rear==0){
            front=0;
            rear=1;
        }
        if(size==items.length)
            resize(size*2);
        if(front==-1)
            front=items.length-1;
        items[front]=item;
        front--;
        size++;
        if(front==-1)
            front=items.length-1;
    }


    /**  Adds an item to the back of the Deque. */
    public void addLast(Item item){

        if(front==-1 && rear==0){
            front=items.length-1;
            rear=0;
        }
        if(size==items.length)
            resize(size*2);
        if(rear==items.length)
            rear=0;
        items[rear]=item;

        rear++;
        size++;
        if(rear==items.length)
            rear=0;


    }

    /** Returns true if deque is empty, false otherwise. */
    public boolean isEmpty(){
        if(size==0)
            return true;
        else
            return false;
    }

    /** Removes and returns the item at the front of the Deque. If no such item exists, returns null. */
    public Item removeFirst(){
        if(isEmpty())
            return null;
        int index;
        if(front==items.length-1)
            front=-1;
        Item item=items[front+1];
        items[front+1]=null;
        front++;
        size--;
        return item;
    }

    public Item removeLast(){
        if(isEmpty())
            return null;
        if(rear==0)
            rear=items.length;
        Item item=items[rear-1];
        items[rear-1]=null;
        rear--;
        size--;
        return item;
    }


    /** Returns the number of items in the Deque. */
    public int size() {
        return size;
    }

    /** Prints the items in the Deque from first to last, separated by a space. */
    public void printDeque(){
        if(isEmpty())
            return;
        if(size==items.length){
            for(int i=front+1;i<items.length;i++)
                System.out.print(items[i]+" ");
            for(int i=0;i<=rear;i++)
                System.out.print(items[i]+" ");

        }
        else if(front>=rear){
            for(int i=front+1;i<items.length;i++)
                System.out.print(items[i]+" ");
            for(int i=0;i<rear;i++)
                System.out.print(items[i]+" ");
        }
        else if(front<rear){
            for(int i=front+1;i<rear;i++)
                System.out.print(items[i]+" ");
        }

    }

    public Item get(int index){
        if(isEmpty())
            return null;
        return items[index];
    }






}
