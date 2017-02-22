/*
 * Copyright (c) 2017, Preenos Crowd Technologies Private Limited
 * 
 * This file contains mandatory setup required by the photon framework to run your tests.
 * 
 * You won't need to edit this file until explicitly asked to do so by a validator or admin.
 * 
 * For instructions on how to write tests, please read the README.md file in the project root folder.
 * 
 */

// NOTE: You don't need to modify this file
// Please read the README.md in the project root folder for instructions on writing tests

package com.the99tests.photon.tests;

import java.io.IOException;
import java.util.List;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.collections.Lists;
import org.testng.reporters.ExitCodeListener;



public class TestRunner {
	public static void main(String[] args) throws IOException {
		TestNG testng = new TestNG();
		testng.setUseDefaultListeners(false);
		testng.addListener(new ExitCodeListener());
		List<String> suites = Lists.newArrayList();
		suites.add("testng.xml");//path to xml..
		testng.setTestSuites(suites);
		testng.run();
		
		System.out.println(testng.getStatus());
		if(testng.hasFailure() || testng.hasSkip()) {
			System.out.println("FAILED");
			System.exit(1);
		} else {
			System.out.println("PASSED");
			System.exit(0);
		}
	}
}
