package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"FeatureFiles"},monochrome = true,glue = {"stepdefination"},plugin = {"pretty","html:target/cucumber-reports"} )
public class Runner {

	
	
	
	
	
}
