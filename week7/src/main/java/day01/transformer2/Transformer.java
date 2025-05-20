package day01.transformer2;

public class Transformer implements Transformable{
    private String name;
    private boolean transformed;

    public Transformer(String name) {
        this.name = name;
        this.transformed = false;
    }
    @Override
    public void transform() {
        this.transformed = true;
        System.out.println(name + " has transformed! 🔁");
    }

    public boolean isTransformed() {
        return transformed;
    }

    public String getName() {
        return name;
    }
}
