package Partie1.exo4;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
          List<Integer> nombres = Arrays.asList(1, 2, 3);

        int sommeCarres = nombres.stream()
                                 .map(n -> n * n)
                                 .reduce(0, Integer::sum);

        System.out.println("Somme des carrés : " + sommeCarres);
    }
}
