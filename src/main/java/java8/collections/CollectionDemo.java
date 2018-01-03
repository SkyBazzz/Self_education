package java8.collections;



import org.slf4j.Logger;
import utils.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java8.collections.utils.Utils.getStringIntegerMap;

public class CollectionDemo {

    private static Logger logger = Utils.getLoggerForClass();

    private CollectionDemo() {
    }

    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));) {
            int size = Integer.parseInt(bufferedReader.readLine());
            String name = bufferedReader.readLine();
            List<Map<String, Integer>> list = new LinkedList<>();
            logger.info("List is initialised");

            Map<String, Integer> map = getStringIntegerMap(size, name);
            Map<String, Integer> map2 = getStringIntegerMap(size, name);
            Map<String, Integer> map3 = getStringIntegerMap(size, name);
            logger.info("Maps are initialised");
            list.add(map);
            list.add(map2);
            list.add(map3);
            logger.info("Maps are added to the list");
            list.forEach(System.out::print);
        } catch (IOException e) {
            logger.error(e.getClass() + " was found");
        }

    }

}
