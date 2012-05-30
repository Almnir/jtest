
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class jtest {
    static Logger logger = Logger.getLogger(jtest.class);

    public static void doIt() {
        logger.debug("Did it again!");
    }
    public static void main(String[] args)
    {
        BasicConfigurator.configure();
        logger.info("Entering application.");
        doIt();
        // logger.fatal("Unable to proceed!");
        logger.info("Exiting application.");
    }
}
