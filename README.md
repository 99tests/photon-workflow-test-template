# Photon Test Framework Project Template

## Overview

The Photon Test Framework is a set of Java libraries built on top of Selenium/Appium to make it easy to run tests on the 99tests platform.

This project template will help you write and submit your tests in 5 easy steps.

1. Setup your project using this template
2. Configure the project for your platform
3. Write tests that generate checkpoints
4. Watch and Verify test execution on the 99tests test playground
5. Submit your project to 99tests

## Step 1: Setup your project

### Get a copy of this template

Download(don't clone) this repository into your local machine.

We suggest creating a separate workspace for your 99tests related activities, and placing your template there.

### Rename the project

- Go to the `pom.xml` file and change the Artifact Id based on the product and workflow you are automating.
- Select the project folder, right-click -> Refactor -> Rename. Rename it to the same name you used for the Artifact Id above.

## Step 2: Configure your project

### Customize the project for your platform

This project is configured for web browsers.

To target mobile devices/browsers, ensure that the class `WorkflowTest` extends the appropriate `PhotonSession.PhotonSuite` for your platform.

E.g. for android, this could be

    PhotonSession.PhotonSuite<AndroidDriver<MobileElement>>

### Setup driver for local execution

Open the `com.the99tests.photon.tests.WorkflowTest` class in this project

Customize the `setupLocalWebDriver` method to setup and return a valid local web driver setup.

Note that this method should initialize a local variable and return it.

## Step 3: Write Tests that generate checkpoints

### Driver and session access

The web driver can be accessed in your tests via the `driver` variable.

The test session functionality for generating checkpoints can be accessed via the `session` variable.
     
### Writing tests and generating checkpoints

Write your code in the `Tests` block in `WorkflowTest`.

Visit the workflow tab on the 99tests platform for reference.

Create a test function for each test case, named appropriately.

Write code for each test case step.

Against each test case step, you will find a checkpoint(something like `51_43_4174_21493_login`)

At the point where the test case step would normally succeed, register the checkpoint with `session.checkpoint`, passing the checkpoint name as the parameter.

Here's an example of what a signup test may look like when you're done.

	 @Test
	 public void testSignup() throws Exception {	
	     driver.get("http://example.com")
	     ... code to reach signup form ...
	     session.checkpoint("51_43_4174_21493_signup_form");
	     ... code to add signup details ...
	     session.checkpoint("51_43_4174_21494_signup_details");
	     ... code to verify successful signup ...
	     session.checkpoint("51_43_4174_21495_signup_successful");
	 }
	 
### Running and debugging your tests

To run your tests, execute the `exec:java` Maven goal.

There are simple ways to run and debug a maven project in both [Eclipse](https://books.sonatype.com/m2eclipse-book/reference/running-sect-running-maven-builds.html) and [IntelliJ](https://www.jetbrains.com/help/idea/2017.1/executing-maven-goal.html).

When you run your tests, each checkpoint will generate a screenshot in your project folder.
	 
## Step 4: Watch and Verify test execution on the 99tests test playground

Once your local tests are running, verify the tests on our playground by changing your driver setup.

Note that scripts which only run locally on your machine are not considered as a valid submission. 

Please ensure you verify test runs in the playground before submitting your tests.

### Accessing the 99tests test playground
 
Open the `com.the99tests.photon.tests.WorkflowTest` class in this project

Customize the `setupPlaygroundWebDriver` method to setup and return a valid playground web driver setup.
Driver capabilities for various platforms can be found [here](https://hackmd.io/GwUwTOAMCMYLQEMQIMZwCwM3ARgdgFY84Z1ZJ1IBmAEwDMCg)

in the `getEnvironment` method, change the return value to `PhotonTestEnvironment.PLAYGROUND`.
 
### Watch your tests executing live
   
When you start executing your tests, your console output will display details to connect and watch the tests executing live.

You will need a VNC client to view the test execution.

Tests that execute successfully on the tester playground are guaranteed to work on our platform. Please ensure compatibility with the tester playground.

## Step 5: Submit your project

Execute the `package` maven goal on the project. This will create a zip file in the `target` folder.

Submit the zip file via mail or upload the script if you have permissions.

## Other information

### Test scope and platforms

Target only one platform and one workflow in each project. If you have common functions between platforms or workflows, create a separate class file in the project which you can copy to other projects.

### Adding other source files

You can add other source files required for the test automation in any package in this project.

### Adding libraries

Add required libraries via Maven by editing the 'pom.xml' included in the project root folder.

Local libraries/jar files are not supported. 

### Adding test data

Add data files required for the tests in the 'testdata/' folder, so that the automation framework can find them.

Use the relative path 'testdata/<file-name>' to access the data files. 

### Test run environment

The tests you provide will be run on a headless linux server, which accesses a selenium grid to run tests on browsers and device emulators.

This means that you will not be able to run any code that requires a GUI on the server to be present. Please be aware of this while writing tests for the platform

## Help other testers write great tests

The `PhotonSession` library is open source.

The reason is simple, we want testers to help each other and grow with us.

If you have written a function that can be used by other testers and make life easy for them, please add the function to the [PhotonSession library](https://github.com/99tests/photon-session) and send us a pull request.






