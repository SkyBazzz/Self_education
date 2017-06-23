package java8.collection;



import java.util.*;

import static java8.collection.Types.CAT;
import static java8.collection.Types.SOBAKA;

public class JavaTutorialsDemo {
    public static void main(String[] args) {

//        System.out.println(getLowerItem(10));
//        System.out.println(getNextItem(10));

        Map<Integer, String> m = new SimpleRuCache(2);
        m.put(1, "a");
        m.put(2, "b");
        m.put(3, "c");

        m.get(2);
        m.put(9, "d");
        System.out.println(m);

        Map<Types, String> e = new EnumMap<>(Types.class);

        e.put(CAT, "киса");
        e.put(CAT, "котёнок");
        e.put(SOBAKA, "пёсик");

        System.out.println(e);}

    public static Integer getNextItem(Integer elem) {
        return initSet().higher(elem);

    }

    public static Integer getLowerItem(Integer elem) {
        return initSet().lower(elem);

    }

    // NavigableSet extends SortedSet
    private static NavigableSet<Integer> initSet() {
        NavigableSet<Integer> sortedSet = new TreeSet<>();

        for (int i = 1; i < 11; i++) {
            sortedSet.add(i);
        }
        return sortedSet;
    }
}

