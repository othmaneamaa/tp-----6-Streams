package Partie1.exo2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
         List<String> noms = Arrays.asList("Alice", "Bob", "Charlie");
         List<String> majuscules =noms.stream()
                                      .map(String::toUpperCase)
                                      .collect(Collectors.toList());


        System.out.println(majuscules);
        
        }
}
