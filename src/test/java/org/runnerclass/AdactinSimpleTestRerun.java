package org.runnerclass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@src\\test\\resources\\Failed\\failedscenarios.txt", glue = "org.adactinsimplestepdef", dryRun = false, monochrome = true, strict = true)

public class AdactinSimpleTestRerun {

}
