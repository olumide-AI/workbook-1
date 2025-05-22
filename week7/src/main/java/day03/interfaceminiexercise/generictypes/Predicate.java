package day03.interfaceminiexercise.generictypes;
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
