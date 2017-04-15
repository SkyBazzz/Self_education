package patterns.factory.watchFactory;

import patterns.factory.maker.DigitalWatchMaker;
import patterns.factory.maker.SandWatchMaker;
import patterns.factory.maker.WatchMaker;

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
