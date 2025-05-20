package day02.bonusexerciseinterface.mashupmadness;

public interface Singer {
    default String perform() { return "La la la!"; }
}
