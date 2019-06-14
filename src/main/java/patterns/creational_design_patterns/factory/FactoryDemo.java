package patterns.creational_design_patterns.factory;

import patterns.creational_design_patterns.factory.preparation_data.watchFactory.WatchFactory;
import patterns.creational_design_patterns.factory.preparation_data.maker.WatchMaker;

public class FactoryDemo {
    public static void main(String[] args) {
        WatchMaker maker = WatchFactory.getWatchMaker("sadasd");

        maker.createWatch().showTime();

    }


}
