package day02.bonusexerciseinterface.puzzle;

import java.util.Random;

public class RandomParrot implements Speaker{
    private Speaker[] speakers;

    public RandomParrot(Speaker... speakers){
        this.speakers = speakers;
    }

    public String speak(){
        int index = new Random().nextInt(speakers.length);
        return speakers[index].speak();
    }

}
