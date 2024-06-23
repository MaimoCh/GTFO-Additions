package gtfoaddn.api.util;


import gtfoaddn.api.GTFOAddnValues;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GTFOAddnLog {

    private GTFOAddnLog() {}

    public static Logger logger = LogManager.getLogger(GTFOAddnValues.MODNAME);
}
