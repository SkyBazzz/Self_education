package patterns.factory.preparation_data.watch;

import java.util.Date;

public class DigitalWatch implements Watch {

    public void showTime() {
        System.out.println(new Date());
    }
}
