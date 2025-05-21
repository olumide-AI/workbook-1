package day02.bonusexerciseinterface.pokemon;

public class BattleArena {
    public static void main(String[] args) {
        Charizard charizard = new Charizard();
        Squirtle squirtle = new Squirtle();
        Pidgeotto pidgeotto = new Pidgeotto();

        System.out.println("Battle Royale");
        charizard.fire();
        charizard.fly();
        squirtle.splash();
        pidgeotto.fly();
    }
}
