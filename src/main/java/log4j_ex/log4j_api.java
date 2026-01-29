package log4j_ex;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j_api {		

	    private static final Logger logger = LogManager.getLogger(log4j_api.class);

	    public static void main(String[] args) {
	        logger.info("This is information message");
	        logger.debug("This is debug message");
	        logger.fatal("This will  run ");
	        }
}
