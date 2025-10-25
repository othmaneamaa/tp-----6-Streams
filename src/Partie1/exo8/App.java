package Partie1.exo8;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
      List<Integer> nombres = Arrays.asList(10, 20, 30, 40);
        int seuil = 25;

        long count = nombres.stream()
                            .filter(n -> n > seuil)
                            .count();

        System.out.println("Nombre d'éléments supérieurs à " + seuil + " : " + count);
    
    }
}
