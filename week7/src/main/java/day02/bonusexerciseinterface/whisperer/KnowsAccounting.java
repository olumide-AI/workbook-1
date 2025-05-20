package day02.bonusexerciseinterface.whisperer;

public interface KnowsAccounting {
    default String accounting() { return "Accounting guru"; }
}
