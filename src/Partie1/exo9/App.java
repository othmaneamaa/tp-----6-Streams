package Partie1.exo9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
         List<String> mots = Arrays.asList("a", "bb", "ccc", "dd", "eeee");

        Map<Integer, List<String>> groupes = mots.stream()
                                                 .collect(Collectors.groupingBy(String::length));

        System.out.println(groupes);
    }
}
