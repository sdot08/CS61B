/* Represent a list of integers, where all the "list" work is delegated
 * to a naked IntList. */

public class SList{
	public class IntNode {
		public int item;     /* Equivalent of first */
		public IntNode next; /* Equivalent of rest */

		public IntNode(int i, IntNode h) {
			item = i;
			next = h;		
		}
	} 

	private IntNode sentinel;
	int size;
	/** Creates an empty list. */
	public SList() {
		sentinel=new IntNode(63,null);
		size=0;
	}

	public SList(int x) {
		sentinel=new IntNode(63,null);
		sentinel.next=new IntNode(x,null);
		size=1;
	}

	/** Adds an item of the front. */
	public void insertFront(int x) {
		sentinel.next=new IntNode(x,sentinel.next);
		size++;
	}

	/** Gets the front item of the list. */
	public int getFront() {
		return sentinel.next.item;
	}

	/** Puts an item at the back of the list. */
	public void insertBack(int x) {
		IntNode currentNode=sentinel;
		while(currentNode.next!=null)
			currentNode=currentNode.next;
		currentNode.next=new IntNode(x,null);
		size++;
	}

	/** Returns the back node of our list. */
	private IntNode getBackNode() {
		IntNode currentNode=sentinel;
		while(currentNode.next!=null)
			currentNode=currentNode.next;
		return currentNode;
	}

	/** Returns last item */
	public int getBack() {
		IntNode currentNode=sentinel;
		while(currentNode.next!=null)
			currentNode=currentNode.next;
		return currentNode.item;	

	}

	public int size() {
		return size;
	}

	public void print(){
		IntNode currentNode=sentinel;
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