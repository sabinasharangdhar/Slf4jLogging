

/**
 * 
 */
package com.groupcdg.lcp.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author sabina
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
    	Logger logger = LoggerFactory.getLogger(TestLogger.class);
		
	    logger.info("Begin application logging from hello word:::");
	    
    	TestLogDelegate log = new TestLogDelegate();
    	
    	log.logStaticlogs();
	    
	   

	}

}
