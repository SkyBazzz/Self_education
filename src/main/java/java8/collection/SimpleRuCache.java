package java8.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class SimpleRuCache extends LinkedHashMap{

    private final int capasity;

    public SimpleRuCache(int capasity) {
        super(capasity+1, 1.1f, true);
        this.capasity = capasity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return this.size() > capasity;
    }
}
