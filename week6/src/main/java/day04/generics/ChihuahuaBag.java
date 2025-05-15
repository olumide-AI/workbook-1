package day04.generics;

import java.util.ArrayList;
import java.util.List;

public class ChihuahuaBag {
    private List<Chihuahua> chihuahuaList = new ArrayList<>();

    public void add(Chihuahua chihuahua){
        chihuahuaList.add(chihuahua);
    }

    public void printContents(){
        for (Chihuahua chihuahua: chihuahuaList){
            System.out.println("Chihuahua: " + chihuahua.getName());
        }
    }
}
