package LinkedList;

public class CustomLinkedList {
    private LinkedNode head;

    public CustomLinkedList(int someValue){
        head = new LinkedNode(someValue);
    }

    public void addInTheStart(int info){
        LinkedNode pointer = head;
        LinkedNode newNdode = new LinkedNode(info);

        if (head == null){
            head = newNdode;
        }

        newNdode.next = head;
        head.prev = newNdode;
        head = newNdode;
    }

    public void deletefromStart(){
        LinkedNode pointer = head;

        if (head == null){
            return;
        }

        head = head.next;
        head.prev = null;
    }

    public void addInTheEnd(int info){
        LinkedNode pointer = head;
        LinkedNode newNode = new LinkedNode(info);

        if (head == null){
            addInTheStart(info);
            return;
        }

        while (pointer.next != null){
            pointer = pointer.next;
        }

        pointer.next = newNode;
        newNode.prev = pointer;
    }

    public void deleteFromEnd(){
        LinkedNode pointer = head;

        if (head == null){
            return;
        }

        if (pointer.next == null){
            pointer = null;
            return;
        }

        while (pointer.next.next != null){
            pointer = pointer.next;
        }

        pointer.next.prev = null;
        pointer.next = null;
    }
}
