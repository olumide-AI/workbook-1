import java.sql.SQLOutput;
import java.util.Scanner;

public class FridayMiniExercises {
    public static void main(String[] args) {

        //Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // 1. Say Hello
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "! welcome to the game. ");
        System.out.println(); //Styling choice

        // 2. Age in Dog Years
        System.out.println("How old are you: ");
        int age = scanner.nextInt();
        int ageInDogYears = age * 7;
        scanner.nextLine(); //Clear new line left by int
        System.out.println("Your age in dog years is: " + ageInDogYears);
        //We don't need to put another new line here?
        System.out.println(); //Styling choice

        // 3. Dice Roll
        //double randomNum = scanner.nextDouble();
        double randomNum = Math.floor(Math.random() * 6) + 1;
        System.out.println("Your lucky number is: " + randomNum);
        System.out.println(); //Styling choice

        // 4. Hero Stats
        System.out.println("What is hero name: ");
        String heroName = scanner.nextLine();

        System.out.println("What is your strength between 1-100: ");
        int heroStrength = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your hero agility: ");
        int heroAgility = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Hero: " + heroName + " | Strength: " + heroStrength + " Agility: " + heroAgility);
        System.out.println(); //Styling choice

        // 5. Level Up!
        System.out.println("What is your current level: ");
        int currentLevel = scanner.nextInt();
        currentLevel +=1;
        scanner.nextLine();
        System.out.println("You leveled up! You are now level " + currentLevel);
        System.out.println(); //Styling choice

        // 6. Coin Calculator
        System.out.println("How many Gold coins found: ");
        int goldCoinFound = scanner.nextInt();
        System.out.println("How many Silver coins found: ");
        int silverCoinFound = scanner.nextInt();
        int totalScore = (10 * goldCoinFound) + (silverCoinFound);
        scanner.nextLine();
        System.out.println("Your total points score is: " + totalScore);
        System.out.println(); //Styling choice

        // 7. Odd or Even Dice
        int diceRandomNum = (int) (Math.random() * 6) + 1;
        if (diceRandomNum % 2 == 0){
            System.out.println("Your roll is even");
        }
        else{
            System.out.println("Your roll is odd");
        }
        System.out.println(); //Styling choice

        // 8. Critical Hit Chance
        System.out.println("What's your luck stat (0-100)");
        int luckStat = scanner.nextInt();
        scanner.nextLine();
        if (luckStat > 50){
            System.out.println("Critical Hit!");
        }
        else {
            System.out.println("normal Hit");
        }
        System.out.println(); //Styling choice

        // 9. Character Class Check
        System.out.println("What is your character class: Pick warrior or mage");
        String charClass = scanner.nextLine().toLowerCase();
        if (charClass.equals("warrior") ){
            System.out.println("Starting weapon: Sword");
        }
        if (charClass.equals("mage")){
            System.out.println(" Starting weapon: Magic Book");
        }
        System.out.println(); //Styling choice

        // 10. Magic Number Guess
        int secretNumber = 13;
        System.out.println("Guess the secret num");
        int secretGuess = scanner.nextInt();
        scanner.nextLine();
        if (secretGuess == secretNumber){
            System.out.println("You've guessed correctly");
        }
        else{
            System.out.println("You've guessed incorrectly");
        }
        System.out.println(); //Styling choice

        // 11. Speed Trap
        System.out.println("What is your speed: ");
        double playerSpeed = scanner.nextDouble();
        scanner.nextLine();
        if (playerSpeed > 100){
            System.out.println("You're going TOO FAST! SLOW DOWN");
        }
        else{
            System.out.println("Safe speed");
        }
        System.out.println(); //Styling choice

        // 12. Rock Paper Scissors
        //System.out.println("Choose between rock, paper and scissors");
        /*
            while response is the same for computer and user play again
            rock beats scissors
            paper beats rocks
            scissors beat paper

         */

        // 13. Potion Shop
        //If i wanted to use my gold coin from earlier?? How do i do that
        System.out.println("How many Gold coins do you have: ");
        int playerGold = scanner.nextInt();

        System.out.println("How many potions do you want, Potions cost 15 gold each: ");
        int quantityOfPotion = scanner.nextInt();

        int potionCost = 15;
        int totalCostOfPotion = quantityOfPotion * potionCost;
        if (playerGold >= totalCostOfPotion){
            System.out.println("You can afford a potion");
            int remainingGoldLeft = playerGold - totalCostOfPotion;
            System.out.println("Your change is: " + remainingGoldLeft);
        }
        else{
            System.out.println("Not enough gold");
        }
        scanner.nextLine();
        System.out.println(); //Styling choice

        // 14. Damage Calculator
        System.out.println("What is your attack power: ");
        int attackPower = scanner.nextInt();

        System.out.println("What is your enemy defense: ");
        int enemyDefense = scanner.nextInt();

        int damage = (attackPower - enemyDefense);
        if (damage < 0){
            damage = 0;
        }
        System.out.println("Damage dealt: " + damage);
        scanner.nextLine();
        System.out.println(); //Styling choice

        // 15. XP to Next Level
        System.out.println("What is current XP: ");
        int currentXp = scanner.nextInt();

        System.out.println("XP needed to level up: ");
        int levelUpXp = scanner.nextInt();

        int xpNeededToLevelUp = levelUpXp - currentXp;
        System.out.println("XP needed to level up is: " + xpNeededToLevelUp);
        scanner.nextLine();
        System.out.println(); //Styling Choice

        // 16. Dungeon Door Code
        int randomDungeonCode = (int) Math.floor(Math.random() * 100) + 1;
        System.out.println("Guess the Dungeon door code: ");
        int guessedDungeonDoorCode = scanner.nextInt();
        scanner.nextLine();
        //(Math.abs(guessedDungeonDoorCode - randomDungeonCode) <= 5) - better way
        if (guessedDungeonDoorCode >= randomDungeonCode - 5 && guessedDungeonDoorCode <= randomDungeonCode + 5){
            System.out.println("Door Opens! ");
        }
        else{
            System.out.println("Try again");
        }
        System.out.println(); //Styling choice

        // 17. Monster Battle
        System.out.println("What is your HP: ");
        int playerHp = scanner.nextInt();

        System.out.println("What is the monster HP: ");
        int monsterHp = scanner.nextInt();

        System.out.println("What is your attack power: ");
        int playerAttackPower = scanner.nextInt();
        scanner.nextLine();

        monsterHp = monsterHp - playerAttackPower;
        System.out.println("Your HP is now: " + playerHp + " and" + " monster HP is now: " + monsterHp);
        System.out.println(); //Styling choice

        // 18. Treasure Chest Trap
        System.out.println("Do you want to open chest? (yes/no)");
        String chestTrap = scanner.nextLine().toLowerCase();
        if (chestTrap.equals("yes")){
            // Not sure how to make random 50%
            int getGold = (int) (Math.random() * 50) +1;
            System.out.println("You now have: " + getGold + " Gold coins");
        }
        else{
            int loseHp = playerHp - 20;
            scanner.nextLine();
            System.out.println("oh oh you lost 20 HP :( " + loseHp);
        }
        System.out.println(); //Styling choice

        // 19. High Score Check
        System.out.println("What's your score: ");
        int playerScore = scanner.nextInt();

        System.out.println("What's your high score: ");
        int highScore = scanner.nextInt();
        scanner.nextLine();

        if (highScore > playerScore){
            System.out.println("New Record!");
        }
        else{
            System.out.println("Try again.");
        }
        System.out.println(); //styling choice

        // 20. Simple Character Creation
        System.out.println("What is your name: ");
        String myName = scanner.nextLine();

        System.out.println("How old are you: ");
        int myAge = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What's your character class: ");
        String myCharClass = scanner.nextLine();

        System.out.println("How strong are you: ");
        int myStrength = scanner.nextInt();

        System.out.println("How agile are you: ");
        int myAgility = scanner.nextInt();

        int totalPowerScore = (myStrength * 2) + myAgility + (myAge/2);

        System.out.println("welcome, " + myName + " the " + myCharClass + "!");
        System.out.println("Your Power Score is: " + totalPowerScore);
    }
}
