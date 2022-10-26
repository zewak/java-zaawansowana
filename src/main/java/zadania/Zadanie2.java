package zadania;

import java.util.*;

/**
 * Stwórz metodę, która jako parametr przyjmuje listę stringów, następnie zwraca tą listę posortowaną alfabetycznie od Z do A.
 */

public class Zadanie2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaaaa");
        list.add("aaabb");
        list.add("aaacc");
        list.add("aAacc");
        System.out.println("Bez sort:" +list );
        Zadanie2.sortList(list);
        System.out.println("Sort:" +list );

    }


    public static List<String> sortList(List<String> list){
        Comparator<String> listComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.toLowerCase().compareTo(o1.toLowerCase());
            }
        };

      //  list.sort(Comparator.reverseOrder());
        Collections.sort(list, listComparator);
        return list;
    }
}
