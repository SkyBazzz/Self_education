package patterns.factory.preparation_data.maker;

import patterns.factory.preparation_data.watch.SandWatch;
import patterns.factory.preparation_data.watch.Watch;

public class SandWatchMaker implements WatchMaker {
    public Watch createWatch() {
        return new SandWatch();
    }
}
