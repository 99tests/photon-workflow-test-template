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
	public void init() throws IOException, TimeoutException, UnsupportedConfigException {
		if(PhotonSession.isLocal()) {
			/*
			 * TODO: Change your driver based on your environment and browser 
			 */
			driver=new FirefoxDriver();
			PhotonSession.setupLocalSession(driver);
		} else {
			driver=PhotonSession.setupPhotonSession();
		}	
	}
	
	@AfterSuite
	public void close() {
		PhotonSession.closeSession();
		driver.quit();
	} 
	
	/* TODO: Write tests */
	/*
	 * Write your tests here
	 * 
	 * Instructions
	 * 
	 * Your tests will be able to access the webdriver via the 'driver' variable
	 * 
	 * The photon session can be accessed via 'PhotonSession'
	 * 
	 * Against each test case step you will have a list of checkpoints defined,
	 * it will look as follows - 51_43_4174_21493_login
	 * 
	 * Your test code should create checkpoints if the test case step executes successfully
	 * 
	 * To create a checkpoint, use the 'checkpoint' function of PhotonSession
	 * 
	 * Please ensure that checkpoints are created only on successful execution of the test case step
	 * 
	 * Example:
	 * 
	 *  @Test
	 *  public void testSignup() throws Exception {	
	 *      driver.get("http://example.com")
	 *      ... code to reach signup form ...
	 *      PhotonSession.checkpoint("51_43_4174_21493_signup_form");
	 *      ... code to add signup details ...
	 *	    PhotonSession.checkpoint("51_43_4174_21494_signup_details");
	 *      ... code to verify successful signup ...
	 *	    PhotonSession.checkpoint("51_43_4174_21495_signup_successful");
	 *  }
	 *  
	 *  Have fun writing the tests!
	 *  
	 *  Arrange, Act Assert \m/
	 * 
	 */
	
}

/* TODO: Submit your tests
 * 
 * To submit your test, execute the following goal
 * 
 *     mvn package
 * 
 * Then upload the following package to 99 Tests
 * 
 *     target/WorkflowTest-0.0.1-SNAPSHOT-photon-package.zip
 * 
 */
