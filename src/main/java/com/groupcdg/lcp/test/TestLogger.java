package com.groupcdg.lcp.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.vertx.java.platform.Verticle;


	/**
	 * User: jez
	 */
	public class TestLogger extends Verticle {


	    @Override
	    public void start() {
	        // Make sure we call initialize() - this sets up the assert stuff so assert functionality works correctly
	     //   initialize();
	        // Deploy the module - the System property `vertx.modulename` will contain the name of the module so you
	        // don't have to hardecode it in your tests
	    	org.vertx.java.core.logging.Logger  lgr = container.logger();

	    	lgr.info("I am logging something");
	    	container.logger().info("This is logged by the vertex container");
	    	Logger logger = LoggerFactory.getLogger(TestLogger.class);
			
		    logger.info("This is a log from the test class using slf4j to be writen to the log file only");
		    
	    	TestLogDelegate log = new TestLogDelegate();
	    	
	    	log.logStaticlogs();
	    	
	    }

	}


