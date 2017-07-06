/*
 * Copyright (c) 2017, Preenos Crowd Technologies Private Limited
 * 
 * Please read instructions below for writing your tests
 */

package com.the99tests.photon.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.the99tests.photon.PhotonSession;
import com.the99tests.photon.PhotonSession.PhotonSuite.PhotonTestEnvironment;
import com.the99tests.photon.platforms.UnsupportedConfigException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

// change RemoteWebDriver to any other driver if needed(Android/iOS)
public class WorkflowTest extends PhotonSession.PhotonSuite<RemoteWebDriver> {
	/*
	 * Configuration block - please edit carefully
	 * 
	 * Do not change the structure of the code or functions in this block
	 */
	@Override
	protected RemoteWebDriver setupLocalWebDriver() throws Exception {
		// TODO local driver setup
		return null;
	}

	@Override
	protected RemoteWebDriver setupPlaygroundWebDriver() throws Exception {
		// TODO test playground setup
		// more info at https://hackmd.io/GwUwTOAMCMYLQEMQIMZwCwM3ARgdgFY84Z1ZJ1IBmAEwDMCg
		return null;
	} 
	
	@Override
	protected HashMap<String, String> getRDASubmissionInfo() {
		HashMap<String, String> rdaInfo=new HashMap<String, String>();
		rdaInfo.put("email", "<your-email-id>");
		rdaInfo.put("apiKey", "<api-key>");
		rdaInfo.put("workflow", "<workflow-id>");
		rdaInfo.put("enterpriseCycle", "<enterprisecycle-id>");
		rdaInfo.put("automationDeviceId", "<automation-device-id>");
		rdaInfo.put("logType", LogType.BROWSER);
		// for Android, change above line to
		// rdaInfo.put("logType", "logcat");
		return rdaInfo;
	}
	
	@Override
	protected PhotonTestEnvironment getEnvironment() {
		// TODO change this to PhotonTestEnvironment.PLAYGROUND 
		// to test on the 99tests test playground
		return PhotonTestEnvironment.LOCAL;
		// return PhotonTestEnvironment.PLAYGROUND;
	}
	
	/*
	 * Tests block - please write your tests below
	 */
	
}

