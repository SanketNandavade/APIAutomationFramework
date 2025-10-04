package com.api.listeners;

import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

	private static Logger logger = org.apache.logging.log4j.LogManager.getLogger(TestListener.class);
	
	public void onStart(ITestContext context) {
	    logger.info("Test Suite Started!!!!!!  ");
	  }
	
	public void onTestStart(ITestResult result) {
	    logger.info("Test Started!!!!!!  "+result.getMethod().getMethodName());
	    logger.info("Description  "+result.getMethod().getDescription());
	  }
	
	public void onTestSuccess(ITestResult result) {
		 logger.info("Test Suite Passed!!!!!  "+result.getMethod().getMethodName());
		 logger.info("Description  "+result.getMethod().getDescription());
	  }
	
	public void onTestFailure(ITestResult result) {
	    logger.info("Test Suite Failed!!!!!!!  "+result.getMethod().getMethodName());
	    logger.info("Description  "+result.getMethod().getDescription());
	  }
	
	public void onTestSkipped(ITestResult result) {
	    logger.info("Test Suite Skipped!!!!!!  "+result.getMethod().getMethodName());
	    logger.info("Description  "+result.getMethod().getDescription());
	  }
	
	public void onFinish(ITestContext context) {
	    logger.info("Test Suite Completed!!!!!  ");
	  }
	
	
}
