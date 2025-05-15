package day04.generics;

import java.util.ArrayList;
import java.util.List;

public class Bag<T> {
    private List<T> list = new ArrayList<>();

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void add(T item){
        list.add(item);
    }

    public void printContents(){
        for(T item: list){
            System.out.println("Item: " + item);
        }
    }

    public T getFirstItem() {
        if (!list.isEmpty()){

        return list.getFirst();
        }
        else{
            return null;
        }
    }

}
