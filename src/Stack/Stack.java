package Stack;

public class Stack {
    private Node top;
    private int size;

    public Stack(){
        top = null;
        size = 0;
    }

    public void push(int info){
        Node newNode = new Node(info);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop(){
        if (top == null){
            System.out.println("Empty");
        }
        int info = top.info;
        top = top.next;
        size--;
        return info;
    }

    public int peek(){
        if (top == null){
            System.out.println("Empty");
        }
        return top.info;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if (top == null){
            return true;
        } else {
            return false;
        }
    }
}
