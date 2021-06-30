package org.adactinsimplestepdef;

import java.io.IOException;

import org.functionallib.Baseclass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Baseclass {
	@Before(order = 1)
	public void beforeScenario01() {
		chromeBrower();
	}

	@Before(order = 2)
	public void beforeScenario02() {
		maxWindow();
		implicitWait();
	}

	@After(order = 2)
	public void afterScenarioEnds(Scenario s) throws IOException {

		//String name = s.getName().replaceAll(" ", "_");
		//takeSnapShot(name);
		
		if (s.isFailed()) {
			TakesScreenshot ts= (TakesScreenshot)driver;
			byte[] sshot = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(sshot, "image/png");
			
		}
		
		System.out.println("Process Completed.............");
	}

	@After(order = 1)
	public void afterScenario() {

		quitBrower();
		System.out.println("Adactin Registration is Completed");
	}

}
