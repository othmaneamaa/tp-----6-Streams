package Partie1.exo7;

import java.util.Arrays;
import java.util.List;

public class App {
     public static void main(String[] args) {
        List<String> noms = Arrays.asList("Bob", "Alice", "Charlie");

        String resultat = noms.stream()
                              .filter(s -> s.startsWith("A"))
                              .findFirst()
                              .orElse("Aucune chaîne ne commence par A");

        System.out.println(resultat);
}
}
