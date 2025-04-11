public class MathApp {
    public static void main(String[] args) {
        // 4. Find and display the square root a variable after it is set to 5.0
        double numFive = 5.0;
        double sqrtFive = Math.sqrt(numFive);
        System.out.println("Square root of five is: " + sqrtFive);

        // 5. Find and display the distance between the points (5, 10) and (85, 50)
        // An example of widening inserting ints into a double
        int coordX1 = 5;
        int ccordY1 = 10;
        int coordX2 = 85;
        int coordY2 = 50;

        double distance = Math.sqrt(Math.pow(coordX2 - coordX1, 2) +Math.pow(coordY2 - ccordY1, 2));
        System.out.println("Distance between the points: " + distance);

        int id = 10135;
        String name = "Brandon Plyers";
        float pay = 5239.77f;
        System.out.printf("%s (id: %d) $%.2f", name, id, pay);


    }
}
