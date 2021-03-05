# Test-automation-pokemonTest

This is Java pokemonTest project which covering a variety of technology for automated testing

## Tools

* Maven 3 or over
* Cucumber-JVM
* JUnit
* Selenium Webdriver


## Requirements

In order to utilise this project you need to have the following installed locally:

* Maven 3 or Over
* Chrome,Firefox or Safari (UI tests use Chrome by default, can be changed in configretion.properties)
* Java 1.8
* IntelliJ IDEA 2016 or 2020
* JDK 11 or over

## Usage

Create a copy of this repository in to your local machine.Open the Future files with chose IDE
or 
Open the directory containing the repository in a terminal
Run mvn test

## Concepts Included

Test Case design and Test Plan documents are under the resources in test folder

* Under Pom.xml file there are all dependencies and necessary plugins and profiles such as maven-surefire-plugin,cucumber 
		HTML Report,Web Driver Manager ect.

* Under cukesRunners package there are two runner class
       -CukesRunner.java :use  @RunWith(Cucumber.class) annotation to run the test cases with the help of JUnit and a bunch of 
       	Cucumber options in runner class such as features, glue, plugin, dryRun and tags.
       -FailedRunner.java
       
* Under pages package there are related pages about module
       -BasePage.java   :BasePage class  contains all the common WebElements and functionalities of the application.All page 
       	classes extend to that BasePage class.
       -SearchPage.java
       -MainPage.java
       -ByNamePage.java
       
* Under stepDefinitions package there are defined step definitions for features
       -Hooks.java   : it used @Before/@After annotations to gather all common setup and teardown requirements for all the step 
       	definitions such as launching browser, implicit wait, deleting cookies,taking screenshot for failed scenarios.
       -ByNameStepDef.java
       -SearchFunctionStepDef.java
       
* Under utilities package there are two utility files
       -Driver.java : It used Singleton Design Pattern which makes sure that there is going to be only a single WebDriver object 
       	throughout the framework and none of the class will be able to create another WebDriver object.
       -BrowserUtils
       -configurationReader.java : it used for reading the data from configurationProperties throughout the framework.

* Under resources in features directory there are two features files for scenarios               
       -ByName.feature
       -SearchFunction.feature
       
* Under resources there is a configuration file for centralize the properties
       -configuration.properties :In this file I store some common data such as browser, credentials, URL for UI Testing.

## Reporting

	This framework produces "default cucumber reports" which is not that much fancy. Because of that it used very detailed "Cucumber HTML Reports" which generates bar charts, pie charts and tables with the help of cucumber reports plugin in pom.xml file.

