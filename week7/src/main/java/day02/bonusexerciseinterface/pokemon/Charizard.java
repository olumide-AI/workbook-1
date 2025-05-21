package day02.bonusexerciseinterface.pokemon;

public class Charizard implements FireAttack, Fly{
    public void fly(){
        System.out.println("Charizard flies high in the sky! ");
    }

    public  void fire(){
        System.out.println("Charizard uses Flamethrower! ");
    }
}
