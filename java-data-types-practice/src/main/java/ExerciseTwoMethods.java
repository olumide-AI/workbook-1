import java.util.Scanner;

public class ExerciseTwoMethods {
    public static void main(String[] args) {
        //1
        String playerTitle = getPlayerTitle("John");
        System.out.println(playerTitle);

        //2
        int givenXp = 1000;
        int doubledXp = doubleXP(givenXp);
        System.out.println("Orignal level XP: " + givenXp + " and doubled XP is " + doubledXp);

        //3
        int currentXP = 100;
        int threshold = 1000;
        if (hasLeveledUp(currentXP, threshold)){
            System.out.println("You leveled up!");
        }
        else{
            System.out.println("Keep grinding...");
        }

        //4
        int rollOne = rollDice();
        int rollTwo = rollDice();
        int rollThree = rollDice();

        System.out.println("roll one is " + rollOne);
        System.out.println("roll two is " + rollTwo);
        System.out.println("roll three is " + rollThree);

        //5
        int strength = 100;
        int enemyDefense = 50;
        int damageCaused = calculateDamage(strength,enemyDefense);
        System.out.println("Damage dealt is: " + damageCaused);

        //6 - check this one something seems off
        boolean bothTrue = canOpenChest(true, true);
        System.out.println("Has key or lock is broken is: " + bothTrue);

        boolean bothFalse = canOpenChest(false, false);
        System.out.println("Has no key or no lock is broken is: " + bothFalse);

        boolean hasKeyTrue = canOpenChest(true, false);
        System.out.println("Has key or no lock is broken is: " + hasKeyTrue);

        boolean brokenLockTrue = canOpenChest(false, true);
        System.out.println("Has no key or  lock is broken is: " + brokenLockTrue);

        //7.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your class:");
        System.out.println("0-10 - Peasant");
        System.out.println("11-20 - Rogue");
        System.out.println("21-30 - Mage");
        System.out.println("Anything else - Warrior");
        System.out.print("Enter your choice now: ");

        int choice = scanner.nextInt();
        String playerClass = getPlayerClass(choice);
        System.out.println("You have chosen to be a : " + playerClass);

        //8.
        int currentGold = 100;
        int goldFound = 190;
        int totalGold = addGold(currentGold, goldFound);
        System.out.println("Total Gold found so far is: " + totalGold);

        //9.
        int taskDone = 20;
        int totalTasks = 100;

        if(isQuestComplete(taskDone,totalTasks)){
            System.out.println("Quest complete!");
        }
        else{
            System.out.println("You still have work to do.");
        }

        // 10
        System.out.println("Boss defeated? " + isBossDefeated(80, 0, false));
        System.out.println("Boss defeated? " + isBossDefeated(0, 40, false));
        System.out.println("Boss defeated? " + isBossDefeated(0, 80, true));
        System.out.println("Boss defeated? " + isBossDefeated(20, 50, true));


    }
    // 1. public static String getPlayerTitle(String name)
    public static String getPlayerTitle(String name){
        return "King " + name;

    }

    // 2. public static int doubleXP(int xp)
    public static int doubleXP(int xp) {
        return xp * 2;
    }

    // 3. public static boolean hasLeveledUp(int currentXP, int threshold)
    public static boolean hasLeveledUp(int currentXP, int threshold){
        if (currentXP >= threshold){
            return true;
        }
        else {
            return false;
        }
    }

    // 4.  public static int rollDice()
    public static int rollDice(){
        return (int) (Math.random() *6) +1;
    }

    // 5. public static int calculateDamage(int strength, int enemyDefense)
    public static int calculateDamage(int strength, int enemyDefense) {
        int result = ((strength * 2) - enemyDefense);
        if (result <  0){
        return 0;}
        else {
            return result;
        }
    }

    // 6. public static boolean canOpenChest(boolean hasKey, boolean lockIsBroken)
    public static boolean canOpenChest(boolean hasKey, boolean lockIsBroken){
        if (hasKey || !lockIsBroken){
            return true;
        }
        else {
            return false;
        }
    }

    // 7. public static String getPlayerClass(int choice)
    public static String getPlayerClass(int choice){

        if (choice < 10){
            return "peasant";
        } else if (choice < 20) {
            return "rogue";
        } else if (choice < 30) {
            return "mage";
        }
        else{
            return "warrior";
        }

    }

    // 8. public static int addGold(int currentGold, int goldFound)
    public static int addGold(int currentGold, int goldFound){
        if (goldFound > 100){
            goldFound -= goldFound * 0.10;
        }
        return currentGold + goldFound;
    }

    // 9. public static boolean isQuestComplete(int tasksDone, int totalTasks)
    public static boolean isQuestComplete(int tasksDone, int totalTasks){
        if (tasksDone == totalTasks){
            return true;
        }
        else{
            return false;
        }
    }

    // 10. public static boolean isBossDefeated(int playerHP, int bossHP, boolean usedPotion)
    public static boolean isBossDefeated(int playerHP, int bossHP, boolean usedPotion){
        if (bossHP <= 0){
            return true;
        } else if (playerHP <= 0 && !usedPotion) {
            return false;
        } else if (usedPotion) {
            return (playerHP + 50) > bossHP;
        }
        return playerHP > bossHP;
    }

}
