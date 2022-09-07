package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\main\\java\\Features\\AddProduct.Feature",//path of the feature file
		glue= {"StepDefinitions_Productadd"}, 
		//path of the step definition file
		monochrome = true,  //display the console output in readable format
	  //  tags = {"@MainPages"},
		plugin = {"pretty:target/cucumber-pretty1.txt","html:target/report1/report1.html","junit:junit_output1/cucumber.xml"},// to generate reporting format
		//strict=true,// it follow the rule of mapping between feature and step definition
		dryRun = false

)


public class Product_ADD 
{

		 
}
