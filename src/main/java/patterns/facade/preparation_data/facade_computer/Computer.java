package patterns.facade.preparation_data.facade_computer;

import patterns.facade.preparation_data.facade_parts.DVDRow;
import patterns.facade.preparation_data.facade_parts.HDD;
import patterns.facade.preparation_data.facade_parts.Power;

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
