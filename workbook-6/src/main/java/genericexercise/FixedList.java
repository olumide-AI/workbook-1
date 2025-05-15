package genericexercise;

import java.util.ArrayList;
import java.util.List;

public class FixedList <T>{
    private List<T> items = new ArrayList<>();
    private int maxSize = 0;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;

    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public int getMaxSize() {
        return maxSize;
    }
    public int size() {
        return items.size();
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }


    public boolean add(T item){
       if(items.size() >= maxSize){
           return false;
       }
       items.add(item);
       return true;
    }

    @Override
    public String toString() {
        return "FixedList{" +
                "items=" + items +
                '}';
    }
}
