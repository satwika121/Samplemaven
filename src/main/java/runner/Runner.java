package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		publish=true,
		plugin= {"pretty","html:target/sauceDemoReportDDT.html"},
		monochrome=true,
		features= {"src/main/java/features/SauceDemoDDT.feature"},
		glue="steps"
				)
public class Runner extends AbstractTestNGCucumberTests{
	
	}
