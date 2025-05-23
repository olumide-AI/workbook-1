package customcollections;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private List<T> items;
    private int maxSize;

    public FixedList(int maxSize) {
        this.items = new ArrayList<>();
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

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public void add(T item){
        if(items.size() < maxSize){
            items.add(item);
        }
        else{
            System.out.println("Cannot add more items: list is full");
        }
    }
}
