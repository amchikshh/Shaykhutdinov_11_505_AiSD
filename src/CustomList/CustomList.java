package CustomList;

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
    // есть в мейне
    public void addInTheStart(int info){
        Node newNode = new Node(info);
        newNode.next = head;
        head = newNode;
    }

    // есть в мейне
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

    public void addRange(){

    }

    // есть в мейне
    public void print(){
        Node pointer = head;
        if (head == null){
            System.out.println("Список пуст");
            return;
        }

        while(pointer!=null){
            if (pointer.next == null){
                System.out.println(pointer.info);
            } else {
                System.out.println(pointer.info + " ->");
            }
            pointer = pointer.next;
        }
    }

    // есть в мейне
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

    public void deleteIndex(int index){
        Node pointer = head;
        int counter = 0;

        if (head == null){
            System.out.println("Удаление невозможно");
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        while (counter < index - 1){
            counter++;
            pointer = pointer.next;
        }
        pointer.next = pointer.next.next;

    }

    public void deleteAllSame(int info){
        if (head == null){
            System.out.println("Удаление невозможно");
            return;
        }

        Node pointer = head;

        while (pointer.next != null){
            if (pointer.info == info){
                pointer = pointer.next;
            }
            pointer = pointer.next;
        }
    }

    public void deleteFirst(){
        if (head == null){
            System.out.println("Удаление невозможно");
            return;
        }

        head = head.next;
    }

    // есть в мейне
    public void reverse(){
        CustomList newList = new CustomList();
        Node pointer = head;

        if (pointer == null){
            System.out.println("Список пуст");
            return;
        }

        while(pointer!=null){
            newList.addInTheStart(pointer.info);
            pointer = pointer.next;
        }
        newList.print();
    }

    // есть в мейне
    public int size(){
        int counter = 0;
        Node pointer = head;

        if (head == null){
            return counter;
        }

        while (pointer!= null){
            counter++;
            pointer = pointer.next;
        }
        return counter;
    }

    // есть в мейне
    public boolean isEmpty(){
        if (head == null){
            return true;
        } else {
            return false;
        }
    }

    // есть в мейне
    public boolean elementEntry(int info){
        Node pointer = head;

        if (pointer == null){
            return false;
        }

        while (pointer != null){
            if(pointer.info == info){
                return true;
            }
            pointer = pointer.next;
        }
        return false;
    }

    // есть в мейне
    public void elementEntryIndexes(int info){
        Node pointer = head;
        int index = 0;
        CustomList indexesList = new CustomList();

        if (pointer == null){
            System.out.println("Список пуст");
        }

        while (pointer != null){
            if (pointer.info == info) {
                indexesList.addInTheEnd(index);
            }
            index++;
            pointer = pointer.next;
        }
        indexesList.print();
    }
}
