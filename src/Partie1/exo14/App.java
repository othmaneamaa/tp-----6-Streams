package Partie1.exo14;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> mots = Arrays.asList("hello", "world", "streams");
        char lettre = 'e';

        long count = mots.stream()
                         .flatMapToInt(String::chars)
                         .filter(c -> c == lettre)
                         .count();

        System.out.println("La lettre '" + lettre + "' apparaît " + count + " fois.");
  
    }
}
