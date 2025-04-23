package loopingexercise;

public class Loops {
    public static void main(String[] args) throws InterruptedException {
        //whileLoop();
        //doWhileLoop();
        forLoop();
    }
    public static void whileLoop(){
        // create a while loop to display the text "I love Java" 5 times.
        int i = 0;
        while (i < 5){
            System.out.println("I love java");
            i++;
        }
    }
    public static void doWhileLoop(){
        int count =0;
        do{
            System.out.println("I love java");
            count ++;
        }
        while(count <5);
    }
    public static void forLoop() throws InterruptedException{
        for (int i = 10; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Launch!");
    }
}
