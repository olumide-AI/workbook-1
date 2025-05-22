package day03.interfaceminiexercise.builtinfunctionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(7);

        Consumer<Integer> integerConsumer = (x) -> System.out.println(x);
        for (Integer name: integerList){
            integerConsumer.accept(name);
        }



    }


}
