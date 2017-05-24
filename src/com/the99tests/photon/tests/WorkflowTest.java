/*
 * Copyright (c) 2017, Preenos Crowd Technologies Private Limited
 * 
 * Please read instructions below for writing your tests
 */

package com.the99tests.photon.tests;

import java.io.IOException;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.the99tests.photon.PhotonSession;
import com.the99tests.photon.platforms.UnsupportedConfigException;

public class WorkflowTest {
	/*
	 * Test setup
	 */
	
	static RemoteWebDriver driver=null;

	@BeforeSuite
	public void init() throws IOException, TimeoutException, UnsupportedConfigException, InterruptedException {
		if(PhotonSession.isLocal()) {
			/*
			 * TODO: Local/Test playground setup as per your needs(Please refer to the README for more info)
			 * 
			 * For local, it should be something like
			 * 
			 * driver=ChromeDriver()
			 * PhotonSession.setupLocalSession(driver);
			 */
		} else {
			PhotonSession.setupPhotonSession();
			driver=PhotonSession.getNativeDriver();
		}	
	}
	
	@AfterSuite
	public void close() {
		PhotonSession.closeSession();
		driver.quit();
	} 
	
	/* 
	 * TODO: Write your tests below
	 */
	
}

/* 
 * TODO: Submit your tests
 */
