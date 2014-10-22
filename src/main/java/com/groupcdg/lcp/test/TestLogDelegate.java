/**
 * Copyright © 2014 Computing Distribution Group Ltd. All rights reserved.
 */

package com.groupcdg.lcp.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.vertx.java.core.logging.impl.LogDelegate;
import org.vertx.java.core.logging.impl.SLF4JLogDelegateFactory;

public class TestLogDelegate  {

	protected void logStaticlogs () {
		
		/*SLF4JLogDelegateFactory factory = new SLF4JLogDelegateFactory();
		LogDelegate logdelegate = factory.createDelegate("TestLogDelegate");
		logdelegate.debug(arg0);*/
		Logger logger = LoggerFactory.getLogger(TestLogDelegate.class);
		
	    logger.info("This is a log from the delegate using slf4j also to be writen to the log file ***");
	    logger .debug("*** from the delegate using slf4j Sample debug message"); 
	    logger .info("*** from the delegate using slf4j  Sample info message"); 
	    logger .warn("*** from the delegate using slf4j  Sample warn message"); 
	    logger .error("*** from the delegate using slf4j Sample error message");   
	    
	}

	
}
