package Deque;

public class Deque {
    private Node head;
    private Node tail;
    private int size;

    public Deque(int val){
        head = new Node(val);
        tail = head;
    }

    public void pushFront(int val){
        Node newNode = new Node(val);
        if (head == null){
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void PushBack(int val){
        Node newNode = new Node(val);
        if (head == null){
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public int popFront(){
        if (head == null){
            System.out.println("Empty");
            return 0;
        }
        Node toReturn = head;
        head = head.next;
        size--;
        return toReturn.info;
    }

    public int popBack(){
        if (head == null){
            System.out.println("Empty");
            return 0;
        }
        Node toReturn = tail;
        tail = tail.prev;
        size--;
        return toReturn.info;
    }

    public int peekFront(){
        if (head == null){
            System.out.println("Empty");
        }
        return head.info;
    }

    public int peekBack(){
        if (tail == null){
            System.out.println("Empty");
        }
        return tail.info;
    }

    public int size(){
        return size;
    }
}
