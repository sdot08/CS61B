/**
 * Created by Byron on 2017/7/2.
 */

/**
 * CS61B Project 1A
 */

/**
 * Create a doubly ended queue.
 * */


public class DList<Blorp> {
    public class Node {
        public Blorp item;
        public Node next;
        public Node prev;

        public Node(int i, Node h, Node g) {
            item = i;
            next = h;
            prev = g;
        }
    }

    private Node sentinel;
    int size;
    /** Creates an empty list. */
    public SList() {
        sentinel=new Node(63,sentinel, sentinel);
        size=0;
    }

    public SList(int x) {
        sentinel=new Node(63,sentinel, sentinel);
        sentinel.next=new Node(x,sentinel,sentinel);
        size=1;
    }

    /** Adds an item of the front. */
    public void AddFirst(Blorp Item) {
        sentinel.next=new Node(item, sentinel.next, sentinel);
        size++;
    }

    /** Gets the front item of the list. */
    public int getFront() {
        return sentinel.next.item;
    }

    /** Puts an item at the back of the list. */
    public void insertBack(int x) {
        Node currentNode=sentinel;
        while(currentNode.next!=null)
            currentNode=currentNode.next;
        currentNode.next=new Node(x,null);
        size++;
    }

    /** Returns the back node of our list. */
    private Node getBackNode() {
        Node currentNode=sentinel;
        while(currentNode.next!=null)
            currentNode=currentNode.next;
        return currentNode;
    }

    /** Returns last item */
    public int getBack() {
        Node currentNode=sentinel;
        while(currentNode.next!=null)
            currentNode=currentNode.next;
        return currentNode.item;

    }

    public int size() {
        return size;
    }

    public void print(){
        Node currentNode=sentinel;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
            System.out.println(currentNode.item);
        }
    }

    public static void main(String[] args) {
        SList s1 = new SList();
        s1.insertBack(6);
        s1.insertFront(4);
        s1.insertFront(3);
        System.out.println(s1.getBack());
        System.out.println(s1.size());
        //System.out.println(s1.getFront());
    }
}
