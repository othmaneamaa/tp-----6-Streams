package Partie1.exo10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
         List<Integer> nombres = Arrays.asList(1, 2, 3);

        List<Integer> doubles = nombres.stream()
                                       .map(n -> n * 2)
                                       .collect(Collectors.toList());

        System.out.println(doubles);
    }
}
