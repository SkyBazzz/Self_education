package codewars;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FrequentExample {

    public static int mostFrequentItemCount(int[] collection) {
        return collection.length == 0 ? 0 : getMostPopularElement(eachNumberAppears(collection));
    }

    private static Map<Integer, Integer> eachNumberAppears(int[] collection) {
        if (collection.length == 0) {
            return new HashMap<>();
        }
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer element : collection) {
            Integer count = map.get(element);
            map.put(element, count != null ? count + 1 : 1);
        }
        return map;
    }

    private static Integer getMostPopularElement(Map<Integer, Integer> map) {
        return Collections.max(map.entrySet(), Comparator.comparing(Map.Entry::getValue)).getValue();
    }
}
