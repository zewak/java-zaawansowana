package zadania;

import com.sun.tools.javac.Main;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Stwórz metodę, która jako parametr przyjmuje listę stringów, następnie zwraca tą listę posortowaną alfabetycznie od Z do A.
 */

public class Zadanie1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaaaa");
        list.add("aaabb");
        list.add("aaacc");
        list.add("aAacc");
        System.out.println("Bez sort:" +list );
        Zadanie1.sortList(list);
        System.out.println("Sort:" +list );

    }


    public static List<String> sortList(List<String> list){
      //  list.sort(Comparator.reverseOrder());
        Collections.sort(list, Comparator.reverseOrder());
        return list;
    }
}
