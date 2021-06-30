package org.locators;

import org.functionallib.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends Baseclass {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(id="radiobutton_0"),@FindBy(id="radiobutton_1")})
	private WebElement clickRadioButton;
	public WebElement getClickRadioButton() {
		return clickRadioButton;
	}


}
