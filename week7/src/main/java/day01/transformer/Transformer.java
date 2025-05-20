package day01.transformer;

public class Transformer implements Transformable{
    private String name;
    private boolean transformed;

    public Transformer(String name) {
        this.name = name;
        this.transformed = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTransformed() {
        return transformed;
    }

    public void setTransformed(boolean transformed) {
        this.transformed = transformed;
    }

    @Override
    public void transform() {
        this.transformed = true;
        System.out.println(name + " has transformed");
    }
}
