package patterns.facade.preparation_data.facade_parts;

public class HDD {
    public void copyFromDvd(DVDRow dvdRow) {
        if (dvdRow.hasData()) {
            System.out.println("Coping from dvd");
        } else {
            System.out.println("Please, Insert DVD");
        }
    }
}