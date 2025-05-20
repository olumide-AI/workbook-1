package day02.bonusexerciseinterface.mashupmadness;

public interface Dancer {
    default String perform() { return "*jazz hands*"; }
}
