package java8.collection.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Utils {

    private Utils() {
    }

    public static Map<String, Integer> getStringIntegerMap(int size, String yourName) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            String key = yourName + new Random().nextInt(5);
            int value = new Random().nextInt(100);
            if (map.containsKey(key)) {
                key += Integer.toString(new Random().nextInt(3));
            }
            map.put(key, value);
        }
        return map;
    }
}
