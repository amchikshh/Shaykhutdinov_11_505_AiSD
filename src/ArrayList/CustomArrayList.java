package ArrayList;

public class CustomArrayList<T>{
    private T[] info = null;
    private int start;
    private int end;

    public CustomArrayList(T info){
        this.info = new T[] {info};
        start = 0;
        end = 0;
    }

    public CustomArrayList(T[] array){
        this.info = array;
        start = 0;
        end = 0;
    }

    public void addToStart(T info){
        T[] newData;
        if (info == null){
            start = 0;
            end = 0;

        }

    }

    public void deleteFromStart(){
        if (info == null){
            System.out.println("Список пуст");
            return;
        }

        if (start == end){
            info = null;
            return;
        }
        start++;
    }

    public void
}
