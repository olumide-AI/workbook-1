package day01.transformer2;

public interface Transformable {
    void transform();
    boolean isTransformed();  // move this up from class to interface
    String getName();         // optional, for printing
}
