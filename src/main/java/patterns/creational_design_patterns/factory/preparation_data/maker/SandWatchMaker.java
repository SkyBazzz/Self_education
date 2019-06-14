package patterns.creational_design_patterns.factory.preparation_data.maker;

import patterns.creational_design_patterns.factory.preparation_data.watch.SandWatch;
import patterns.creational_design_patterns.factory.preparation_data.watch.Watch;

public class SandWatchMaker implements WatchMaker {
    public Watch createWatch() {
        return new SandWatch();
    }
}
