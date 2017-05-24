# Photon Workflow Test Project

This project template comes pre-configured to run tests on the 99tests platform.

Please follow instructions below to write, test and submit your project.

## Rename the project

- Go to the `pom.xml` file and change the Artifact Id based on the product and workflow you are automating.
- Choose the `WorkflowTest` folder, right-click -> Refactor -> Rename. Rename it to the same name you used for the Artifact Id above.

## Setup driver for local execution

Open the `com.the99tests.photon.tests.WorkflowTest` class in this project, and find the first TODO comment titled `Local/Test playground setup`

Setup your driver as per your needs.

Set the `driver` variable to your driver(this variable will be accessible in all your tests)

Register the driver with

    PhotonSession.setupLocalSession(driver)
     
## Write tests

Find the second TODO in `WorklowTest.java` titled `Write your tests here`

Visit the workflow tab on the 99tests platform for reference.

Create a test function for each test case, named appropriately.

Write code for each test case step.

Against each test case step, you will find a checkpoint(something like `51_43_4174_21493_login`)

At the point where the test case step would normally succeed, register the checkpoint with `PhotonSession.checkpoint`, passing the checkpoint name as the parameter.

Here's an example of what a signup test may look like when you're done.

	 @Test
	 public void testSignup() throws Exception {	
	     driver.get("http://example.com")
	     ... code to reach signup form ...
	     PhotonSession.checkpoint("51_43_4174_21493_signup_form");
	     ... code to add signup details ...
	     PhotonSession.checkpoint("51_43_4174_21494_signup_details");
	     ... code to verify successful signup ...
	     PhotonSession.checkpoint("51_43_4174_21495_signup_successful");
	 }

When you run your tests, each checkpoint will generate a screenshot in your project folder.
	 
## Verify test execution on the 99tests Test Playground
 
Once your local tests are running, verify the tests on our playground by changing your driver setup.
 
Open the `com.the99tests.photon.tests.WorkflowTest` class in this project, and find the first TODO  comment titled `Local/Test playground setup`

Comment out your local driver setup code.

Create your driver with

- Hub URL: `PhotonSession.PLAYGROUND_HUB_URL`
- Capabilities: As defined in [our documentation](https://hackmd.io/GwUwTOAMCMYLQEMQIMZwCwM3ARgdgFY84Z1ZJ1IBmAEwDMCg)

Register the driver with

    PhotonSession.setupTestPlaygroundSession(webDriver);
   
When running your tests, your console output will display details to connect and watch the tests executing live.

You will need a VNC client to view the test execution.

Tests that execute successfully on the tester playground are guaranteed to work on our platform.

## Submit your project

Execute the `package` maven goal on the project. This will create a zip file in the `target` folder.

Submit the zip file via mail or upload the script if you have permissions.

## Test scope and platforms

Target only one platform and one workflow in each project. If you have common functions between platforms or workflows, create a separate class file in the project which you can copy to other projects.

## Adding other source files

You can add other source files required for the test automation in any package in this project.

## Adding libraries

Add required libraries via Maven by editing the 'pom.xml' included in the project root folder.

Local libraries/jar files are not supported. 

## Adding test data

Add data files required for the tests in the 'testdata/' folder, so that the automation framework can find them.

Use the relative path 'testdata/<file-name>' to access the data files. 

## Test run environment

The tests you provide will be run on a headless linux server, which accesses a selenium grid to run tests on browsers and device emulators.

This means that you will not be able to run any code that requires a GUI on the server to be present. Please be aware of this while writing tests for the platform

## Help other testers write great tests

The `PhotonSession` library is open source.

The reason is simple, we want testers to help each other and grow with us.

If you have written a function that can be used by other testers and make life easy for them, please add the function to the [PhotonSession library](https://github.com/99tests/photon-session) and send us a pull request.






