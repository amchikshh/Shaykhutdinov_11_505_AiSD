public class CustomList {
    private Node head;

    public CustomList() {}

    public CustomList(int info){
        this.head = new Node(info);
    }

    public CustomList(int[] array){
        for (int i = 0; i < array.length; i++){
            addInTheEnd(array[i]);
        }
    }

    public void addInTheStart(int info){
        Node newNode = new Node(info);
        newNode.next = head;
        head = newNode;
    }

    public void addInTheEnd(int info){
        Node newNode = new Node(info);
        Node pointer = head;

        if (head == null){
            head = newNode;
            return;
        } else {
            while (pointer.next != null){
                pointer = pointer.next;
            }
            pointer.next = newNode;
        }
    }

    public void addIndex(int index, int info){
        Node newNode = new Node(info);
        Node pointer = head;
        int counter = 0;

        if (index == 0){
            addInTheStart(info);
            return;
        }

        while (counter != index - 1){
            counter++;
            pointer = pointer.next;
        }

        newNode.next = pointer.next;
        pointer.next = newNode;
    }

    public void deleteLast(){
        Node pointer = head;

        if (head == null){
            System.out.println("Удаление невозможно");
            return;
        }

        if (pointer.next == null){
            pointer = null;
        }

        while(pointer.next.next != null){
            pointer = pointer.next;
        }
        pointer.next = null;
    }

    public void deleteFirst(){
        if (head == null){
            System.out.println("Удаление невозможно");
            return;
        }

        head = head.next;
    }
}
