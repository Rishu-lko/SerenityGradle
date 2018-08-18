package Runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = {"src/test/Feature"},
		glue = {"stepDef"},
		tags = {"@SampleSerenity"},
		monochrome=true)

public class SampleRunner {

}

