package Partie1.exo1;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5, 6);

        nombres.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);
    }
}
