package java8.java8_in_action;

import java.util.Comparator;

public class AppleComparator  implements Comparator<Apple>{

    @Override
    public int compare(Apple o1, Apple o2) {
        return o1.getWeight().compareTo(o2.getWeight());
    }
}