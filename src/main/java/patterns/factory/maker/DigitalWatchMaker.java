package patterns.factory.maker;

import patterns.factory.watch.DigitalWatch;
import patterns.factory.watch.Watch;

public class DigitalWatchMaker implements WatchMaker {

    public Watch createWatch() {
        return new DigitalWatch();
    }
}
