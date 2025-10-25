package Partie1.exo12;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        List<Integer> entiers = IntStream.rangeClosed(1, 10)
                                         .boxed()
                                         .collect(Collectors.toList());

        System.out.println(entiers);
    }
}
