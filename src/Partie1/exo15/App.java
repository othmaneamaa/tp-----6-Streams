package Partie1.exo15;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
         List<Integer> nombres = Arrays.asList(1, 2, 3, 4);

        int produit = nombres.stream()
                             .reduce(1, (a, b) -> a * b);

        System.out.println("Produit des éléments : " + produit);
    }
}
