# Photon Workflow Test Project

## Project Setup 

This Maven project is already setup to integrate with the 99 Tests automation framework. 

You only need to write code necessary to execute your tests, then package and submit it on the 99 Tests platform.

The project executes a single TestNG suite, tests should be written in WorkflowTest.java found in com.the99tests.photon.tests.

Information on how to write and submit the tests is provided in WorkflowTest.java. 

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






