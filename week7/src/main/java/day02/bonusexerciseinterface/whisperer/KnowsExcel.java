package day02.bonusexerciseinterface.whisperer;

public interface KnowsExcel {
    default String excel() { return "working in excel"; }
}
