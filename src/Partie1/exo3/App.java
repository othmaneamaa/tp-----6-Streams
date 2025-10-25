package Partie1.exo3;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(3, 7, 2, 9, 4);

        int max = nombres.stream()
                         .max(Integer::compareTo)
                         .get();

        System.out.println("Le plus grand nombre est : " + max);
    }
}
