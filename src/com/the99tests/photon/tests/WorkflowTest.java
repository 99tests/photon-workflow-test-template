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
		// TODO local driver setup, create a driver and return it
		return null;
	}

	@Override
	protected RemoteWebDriver setupPlaygroundWebDriver() throws Exception {
		// TODO test playground setup
		// more info at https://hackmd.io/GwUwTOAMCMYLQEMQIMZwCwM3ARgdgFY84Z1ZJ1IBmAEwDMCg
		// make sure you return the driver
		return null;
	} 
	
	@Override
	protected HashMap<String, Object> getAPICredentials() {
		HashMap<String, Object> apiInfo=new HashMap<String, Object>();
		apiInfo.put("email", "<your-email-id>");
		apiInfo.put("apiKey", "<your-api-key>");
		return apiInfo;
	}
	
	@Override
	protected HashMap<String, Object> getWorkflowDetails() {
		HashMap<String, Object> workflowInfo=new HashMap<String, Object>();
		workflowInfo.put("workflow", "<workflow-id>"); // 15
		workflowInfo.put("enterpriseCycle", "<enterprise-cycle-id>");
		return workflowInfo;
	}
	
	@Override
	protected HashMap<String, Object> getAutomationDeviceInfo() {
		HashMap<String, Object> deviceInfo=new HashMap<String, Object>();
		deviceInfo.put("automationDeviceId", "<automation-device-id>");
		deviceInfo.put("logType", LogType.BROWSER);
		return deviceInfo;
	}
	
	@Override
	protected HashMap<String, Object> getPhotonSessionSettings() {
		HashMap<String, Object> settings=new HashMap<String, Object>();
		settings.put("checkpointVerification", "on"); // set to off to disable checkpoint verification while developing tests, only works in LOCAL environments
		settings.put("testEnvironment", PhotonTestEnvironment.LOCAL); 
		// for test playground - settings.put("testEnvironment", PhotonTestEnvironment.PLAYGROUND); 
		// for RDA submissions - settings.put("testEnvironment", PhotonTestEnvironment.RDA_SUBMISSION);
		return settings;
	}	
	
	/*
	 * Tests block - please write your tests below
	 */
	
}

