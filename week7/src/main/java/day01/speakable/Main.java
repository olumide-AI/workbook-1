package day01.speakable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Speakable> speakables = new ArrayList<>();
        speakables.add(new Human("OLU"));
        speakables.add(new Robot("A10Z"));
        speakables.add(new Parrot("chosu"));

        letThemSpeak(speakables);

    }
    public static List letThemSpeak(List<Speakable> speakables){
        //List <Speakable> speakableList = new ArrayList<>();
        for (Speakable speakable: speakables){
            if (speakable instanceof Human){
                speakable.speak();
            } else if (speakable instanceof Robot) {
                speakable.speak();
            }
            else if (speakable instanceof Parrot){
                speakable.speak();
            }
            else {
                return null;
            }
        }
        return speakables;
    }
}
