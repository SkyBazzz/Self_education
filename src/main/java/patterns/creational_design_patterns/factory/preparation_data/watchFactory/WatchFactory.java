package patterns.creational_design_patterns.factory.preparation_data.watchFactory;

import patterns.creational_design_patterns.factory.preparation_data.maker.DigitalWatchMaker;
import patterns.creational_design_patterns.factory.preparation_data.maker.SandWatchMaker;
import patterns.creational_design_patterns.factory.preparation_data.maker.WatchMaker;

public class WatchFactory {
    public static WatchMaker getWatchMaker(String maker){
        WatchMaker watchMaker = new SandWatchMaker();
        if (maker.equalsIgnoreCase("digital")){
            watchMaker = new DigitalWatchMaker();
        } else if(maker.equalsIgnoreCase("sand")){
            watchMaker = new SandWatchMaker();
        }
        return watchMaker;
    }
}
