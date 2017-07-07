/**
 * Created by Byron on 2017/7/2.
 */

/**
 * CS61B Project 1A
 */

/**
 * Create a doubly ended queue.
 */


public class LinkedListDeque<Item> {

    public class Node {
        public Item item;
        public Node next;
        public Node prev;


        public Node(Item i, Node h, Node g) {
            item = i;
            next = h;
            prev = g;
        }
        public Node() {
            next = this;
            prev = this;
        }
    }
    private Node sentinel;
    int size;
    /** Creates an empty list. */
    public LinkedListDeque() {
        sentinel=new Node();
        size=0;
    }


    /** Adds an item of the front. */
    public void addFirst(Item Item) {
        Node OriginalFirst=sentinel.next;
        sentinel.next=new Node(Item, sentinel.next, sentinel);
        OriginalFirst.prev=sentinel.next;
        size++;
    }


    /** Puts an item at the back of the list.*/

    public void addLast(Item Item) {
        Node OriginalLast=sentinel.prev;
        sentinel.prev=new Node(Item,sentinel,sentinel.prev);
        OriginalLast.next=sentinel.prev;
        size++;
     }

    /** Returns true if deque is empty, false otherwise.  */
    public boolean isEmpty(){
        if (sentinel.next==sentinel)
            return true;
        return false;
    }
    /** Returns the number of items in the Deque.  */
    public int size() {
        return size;
    }
    /**Prints the items in the Deque from first to last, separated by a space.*/
    public void printDeque() {
        Node currentNode = sentinel;
        while (currentNode.next != sentinel) {
            currentNode = currentNode.next;
            System.out.print(currentNode.item + " ");
        }
    }
    /** Removes and returns the item at the front of the Deque. If no such item exists, returns null.*/
    public Item removeFirst() {
        if(sentinel.next==sentinel)
            return null;
        Item temp=sentinel.next.item;
        sentinel.next.item=null;
        sentinel.next=sentinel.next.next;
        sentinel.next.prev=sentinel;
        size--;
        return temp;

    }
    /** Removes and returns the item at the back of the Deque. If no such item exists, returns null.*/
    public Item removeLast() {
        if(sentinel.prev==sentinel)
            return null;
        Item temp=sentinel.prev.item;
        sentinel.prev.item=null;
        sentinel.prev=sentinel.prev.prev;
        sentinel.prev.next=sentinel;
        size--;
        return temp;

    }
    /**  Gets the item at the given index, where 0 is the front, 1 is the next item, and so forth.
     * If no such item exists, returns null. Must not alter the deque! */
    public Item get(int index){
        Node front=sentinel;
        while(true){
            if(front.next==sentinel)
                return null;
            if(index==0)
                return front.next.item;
            front=front.next;
            index--;
        }
    }
    public Item getRecursive(int index){
        Node front=sentinel;
        Item result=getRecursiveHelper(front, index);
        return result;
    }


    public Item getRecursiveHelper(Node front, int index){

        if(front.next==sentinel)
            return null;
        if(index==0)
            return front.next.item;
        getRecursiveHelper(front.next, --index);
        return null;
    }

}
