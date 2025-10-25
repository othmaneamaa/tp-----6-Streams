package Partie2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {
     static List<String> names = Arrays.asList("Ahmed", "Brahim", "Chaimae", "Badr", "Said", "Amina");
    static List<Integer> numbers = Arrays.asList(3, 5, 7, 10, 15, 20, 25, 30, 35, 40);

    public static void main(String[] args) {
      
        System.out.println("=== Partie 1 : Chaînes ===");
        filterNamesStartingWithA();
        convertNamesToUpperCase();
        findFirstLongName();
        groupNamesByLength();
        concatenateNames();

       
        System.out.println("\n=== Partie 2 : Nombres ===");
        filterEvenNumbers();
        sumAllNumbers();
        findMaxNumber();
        averageGreaterThan10();
        multiplyAllNumbers();

        System.out.println("\n=== Partie 3 : Combinaison ===");
        pairNamesWithNumbers();
    }

  
    
    static void filterNamesStartingWithA() {
        System.out.println("1. Noms commençant par 'A' :");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }

    static void convertNamesToUpperCase() {
        System.out.println("\n2. Noms en majuscules :");
        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        upperNames.forEach(System.out::println);
    }

   
    static void findFirstLongName() {
        System.out.println("\n3. Premier nom avec plus de 5 caractères :");
        names.stream()
                .filter(name -> name.length() > 5)
                .findFirst()
                .ifPresent(System.out::println);
    }

    static void groupNamesByLength() {
        System.out.println("\n4. Regroupement par longueur :");
        Map<Integer, List<String>> grouped = names.stream()
                .collect(Collectors.groupingBy(String::length));
        grouped.forEach((len, list) -> System.out.println(len + " : " + list));
    }

 
    static void concatenateNames() {
        System.out.println("\n5. Concaténation des noms :");
        String result = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }

   
    static void filterEvenNumbers() {
        System.out.println("1. Nombres pairs :");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }

  
    static void sumAllNumbers() {
        System.out.println("\n2. Somme des nombres :");
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }

    
    static void findMaxNumber() {
        System.out.println("\n3. Nombre maximum :");
        numbers.stream()
                .max(Integer::compare)
                .ifPresent(System.out::println);
    }

    
    static void averageGreaterThan10() {
        System.out.println("\n4. Moyenne des nombres > 10 :");
        numbers.stream()
                .filter(n -> n > 10)
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(System.out::println);
    }

    
    static void multiplyAllNumbers() {
        System.out.println("\n5. Produit de tous les nombres :");
        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println(product);
    }

  
    static void pairNamesWithNumbers() {
        System.out.println("1. Paires (nom, nombre) :");
        IntStream.range(0, Math.min(names.size(), numbers.size()))
                .mapToObj(i -> names.get(i) + " - " + numbers.get(i))
                .forEach(System.out::println);
    }
    
}
