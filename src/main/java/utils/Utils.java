package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Utils {

    public static Logger getLoggerForClass() {
        return LoggerFactory.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
    }
}
