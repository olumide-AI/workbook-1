package day02.guessthenumber;

public class GameLauncher {
    public static void main(String[] args) {
        PlayableGame playableGame = new GuessingGame();
        playableGame.startGame();
    }
}
