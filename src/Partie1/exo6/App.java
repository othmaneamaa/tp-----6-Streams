package Partie1.exo6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
     public static void main(String[] args) {
        List<String> noms = Arrays.asList("Alice", "Bob", "Charlie");

        String resultat = noms.stream()
                              .collect(Collectors.joining(","));

        System.out.println(resultat);
    }
}
