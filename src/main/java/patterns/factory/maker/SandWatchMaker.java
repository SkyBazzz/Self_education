package patterns.factory.maker;

import patterns.factory.watch.SandWatch;
import patterns.factory.watch.Watch;

public class SandWatchMaker implements WatchMaker {
    public Watch createWatch() {
        return new SandWatch();
    }
}
