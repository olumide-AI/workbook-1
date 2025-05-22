package day03.streamofexercise.namecombiner;

public class Main {
    public static void main(String[] args) {
        String fn = "Ocean";
        String ln = "Kolawole";
        NameCombiner nameCombiner = (a,b) -> a + " " + b;

        System.out.println(nameCombiner.combine(fn,ln));
    }
}
