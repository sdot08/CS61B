package editor;

import javafx.scene.text.Text;


class FastLinkedList {
    class Node{
        Text nodeText;
        Node prev,next;
        Node(char x){
            nodeText = new Text(String.valueOf(x));
        }
    }

    private Node sentinel;
    private int currentPos;
    private Node currentNode;
    FastLinkedList() {
        sentinel = new Node('q');
        currentNode = sentinel;
        currentPos = 0;
    }
    void addChar(char x){
        Node newNode = new Node(x);
        currentNode.next = newNode;
        newNode.prev = currentNode;
        currentNode = newNode;
        currentPos++;
    }

    void deleteChar(){
        if (currentPos != 0) {
            currentNode = currentNode.prev;
            currentNode.next = null;
            currentPos--;
        }
    }

    int currentPos(){
        return currentPos;
    }

}
