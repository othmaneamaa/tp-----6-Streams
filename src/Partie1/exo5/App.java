package Partie1.exo5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> mots = Arrays.asList("hi", "hello", "hey", "world");

        List<String> resultat = mots.stream()
                                    .filter(s -> s.length() > 3)
                                    .collect(Collectors.toList());

        System.out.println(resultat);
    }
}
