package testRunner;

//the syntax below is junit test runner class and it will execure the test cases

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //this path below is the location of the feature file i.e. path for OrangeHRM.feature. i changed the single backward slashes to double forward slashes
        features = "C://Users//jogz//IdeaProjects//JavaBatch2WebDriver//out//production//SeleniumCucumber//Features//OrangeHRM.feature",
        glue = "stepDefinitions")   //this is the name of the package i.e. stepDefinitions where OrangeHRMsteps is located at (this execute all the files in stepDefinitions package


//i specified where my feature file i.e. OrangeHRM.feature) is available


public class TestRunner {
}
