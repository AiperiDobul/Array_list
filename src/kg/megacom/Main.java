package kg.megacom;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(60);
        numbers.add(60*60);
        numbers.add(60*60*24);
        numbers.add(60*60*24*7);
        numbers.add(60*60*24*30);

        Collections.sort(numbers);
       int i = Collections.binarySearch(numbers, 60*60);
        System.out.println(i);
        System.out.println("----------------");
        Collections.reverse(numbers);
        numbers.forEach(System.out::println);
        System.out.println("----------------");
        System.out.println(Collections.max(numbers));
        System.out.println("----------------");
        System.out.println(Collections.min(numbers));
        System.out.println("----------------");
        Collections.fill(numbers, 42);
        numbers.forEach(System.out::println);




    }
}
