package patterns.factory;

import patterns.factory.preparation_data.watchFactory.WatchFactory;
import patterns.factory.preparation_data.maker.WatchMaker;

public class FactoryDemo {
    public static void main(String[] args) {
        WatchMaker maker = WatchFactory.getWatchMaker("sadasd");

        maker.createWatch().showTime();

    }


}
