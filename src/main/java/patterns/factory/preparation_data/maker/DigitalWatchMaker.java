package patterns.factory.preparation_data.maker;

import patterns.factory.preparation_data.watch.DigitalWatch;
import patterns.factory.preparation_data.watch.Watch;

public class DigitalWatchMaker implements WatchMaker {

    public Watch createWatch() {
        return new DigitalWatch();
    }
}
