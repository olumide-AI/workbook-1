package day01.transformer2;

public class AlienTransformer implements Transformable{
    private String name;
    private boolean transformed;

    public AlienTransformer(String name) {
        this.name = name;
        this.transformed = false;
    }

    public void transform() {
        System.out.println(name + " is shifting form... 🛸");
        this.transformed = true;
    }

    public boolean isTransformed() {
        return transformed;
    }

    public String getName() {
        return name;
    }
}
