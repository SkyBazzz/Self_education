package patterns.factory;

import patterns.factory.watchFactory.WatchFactory;
import patterns.factory.maker.WatchMaker;

public class FactoryDemo {
    public static void main(String[] args) {
        WatchMaker maker = WatchFactory.getWatchMaker("sadasd");

        maker.createWatch().showTime();

    }


}
