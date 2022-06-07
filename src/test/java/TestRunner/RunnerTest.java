

package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = {"src/test/resources/Feature/GoogleSearch.feature",
                            "src/test/resources/FeatureWithBackground/DemoBackground.feature",
	  	                    "src/test/resources/FeatureWithHooks/DemoHooks.feature",
	  	                  "src/test/resources/FeatureWithTags/DemoTags.feature"}, 

glue = { "StepDefinations" },

monochrome = true, 

//plugin = {"pretty", "html:target/HtmlReports" },
//plugin = {"pretty","json:target/JsonReport/report.json"},
//plugin = {"pretty","junit:target/JunitReport/report.xml"},

//OR


  plugin = {"pretty","html:target/HtmlReports/", "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
                     "json:target/JsonReport/report.json",
                     "junit:target/JunitReport/report.xml"}
  
	//	  tags = { "~@important, @last", "@smoketest" }
  
  )
public class RunnerTest {

}
