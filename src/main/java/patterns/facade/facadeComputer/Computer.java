package patterns.facade.facadeComputer;

import patterns.facade.facadeParts.DVDRow;
import patterns.facade.facadeParts.HDD;
import patterns.facade.facadeParts.Power;

public class Computer {
    private Power power;
    private DVDRow dvdRow;
    private HDD hdd;

    public Computer() {
        power = new Power();
        dvdRow = new DVDRow();
        hdd = new HDD();
    }

    public void copy(){
        power.on();
        dvdRow.load();
        hdd.copyFromDvd(dvdRow);
    }
}
