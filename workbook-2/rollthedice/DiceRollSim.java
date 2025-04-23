package rollthedice;

public class DiceRollSim {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1;
        int roll2;
        int counter2 = 0;
        int counter4 = 0;
        int counter6 = 0;
        int counter7 = 0;

        for(int i =0; i <= 100; i++){
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;

            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + "  Sum: " + sum);

            if (sum == 2){
                counter2 ++;
            } else if (sum == 4) {
                counter4 ++;
            } else if (sum ==6) {
                counter6 ++;
            } else if (sum == 7) {
                counter7 ++;
            }
            else{
                System.out.println("invalid count");
            }
            // Display final counter results
            System.out.println("Totals after 100 rolls:");
            System.out.println("Sum of 2 rolled: " + counter2 + " times");
            System.out.println("Sum of 4 rolled: " + counter4 + " times");
            System.out.println("Sum of 6 rolled: " + counter6 + " times");
            System.out.println("Sum of 7 rolled: " + counter7 + " times");




        }
    }


}
