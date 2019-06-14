package patterns.creational_design_patterns.factory.preparation_data.maker;

import patterns.creational_design_patterns.factory.preparation_data.watch.DigitalWatch;
import patterns.creational_design_patterns.factory.preparation_data.watch.Watch;

public class DigitalWatchMaker implements WatchMaker {

    public Watch createWatch() {
        return new DigitalWatch();
    }
}
