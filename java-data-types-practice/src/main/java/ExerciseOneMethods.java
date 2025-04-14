public class ExerciseOneMethods {
    public static void main(String[] args) {
        welcomeHome();
        playerName("Paulo Cunha");
        playerLevel(1);
        playerLevel(2);
        attack("Paulo dog", "Maaike cat");
        attack("Maaike cat", "Paulo dog");
        itemFound("Paulo", "Sword");
        itemFound("Paulo", "Shield");
        itemFound("Paulo", "Pizza");
        castSpell("Gandalf", "Fireball", 30);
        castSpell("Merlin", "Healing Light", 25);
        gameOver("Paulo");
        disInventory("Paulo", 67);
        enterDungeon("Paulo", "candyland");
        victoryDance("Paulo");

    }

    // 1. public static void printWelcome()
    public static void welcomeHome(){
        System.out.println("Welcome Home to code quest");
    }

    // 2. public static void displayPlayerName(String playerName)
    public static void  playerName(String name){
        System.out.println("New Player " + name);
    }

    // 3. public static void showLevel(int level)
    public static void playerLevel(int level){
        System.out.println("Player level is now: " + level);
    }

    // 4. public static void attack(String attacker, String target)
    public static void attack(String attacker, String target){
        System.out.println(attacker + " attacks the " + target + " poww poww");
    }

    // 5. public static void foundItem(String player, String item)
    public static void itemFound(String player, String item){
        System.out.println(player + " found a " + item);
    }

    // 6. public static void castSpell(String wizard, String spellName, int manaCost)
    public static void castSpell(String wizard, String spellName, int manaCost){
        System.out.println(wizard + " casts a " + spellName + " costing " + manaCost + " mana");
    }

    // 7. public static void gameOver(String player)
    public static void  gameOver(String player){
        System.out.println("Game Over for " + player);
    }

    // 8. public static void displayInventory(String player, int itemCount)
    public static void  disInventory(String player, int itemCount){
        System.out.println(player + " has " + itemCount + " items in inventory.");
    }

    // 9. public static void enterDungeon(String player, String dungeonName)
    public static void enterDungeon(String player, String dungeonName){
        System.out.println(player + " has entered the " + dungeonName);
    }

    // 10. public static void victoryDance(String player)
    public static void  victoryDance(String player){
        System.out.println(player + " has a big victory dance");
    }

    //

}
