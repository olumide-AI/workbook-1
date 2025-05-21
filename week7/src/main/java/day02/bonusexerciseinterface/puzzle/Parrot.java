package day02.bonusexerciseinterface.puzzle;

import day02.bonusexerciseinterface.pokemon.Pidgeotto;

public class Parrot implements Speaker{
    private Speaker toMimic;

    public Parrot (Speaker toMimic){
        this.toMimic = toMimic;
    }
    public String speak() { return toMimic.speak(); }
}
