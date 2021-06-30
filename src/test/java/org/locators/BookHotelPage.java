package org.locators;

import org.functionallib.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends Baseclass {
public BookHotelPage() {
	PageFactory.initElements(driver, this);
}

@FindBy(id="first_name")
private WebElement txtFstName;

@FindBy(id="last_name")
private WebElement txtLstName;


@FindBy(id="address")
private WebElement txtAddress;

@FindBy(id="cc_num")
private WebElement txtCcNum;

@FindBy(id="cc_type")
private WebElement selectCcType;


@FindBy(id="cc_exp_month")
private WebElement selectCcExpMonth;


@FindBy(id="cc_exp_year")
private WebElement selectCcExpYear;


@FindBy(id="cc_cvv")
private WebElement txtCcCvv;

@FindBy(id="book_now")
private WebElement clickBookNowBtn;

public WebElement getTxtFstName() {
	return txtFstName;
}

public WebElement getTxtLstName() {
	return txtLstName;
}

public WebElement getTxtAddress() {
	return txtAddress;
}

public WebElement getTxtCcNum() {
	return txtCcNum;
}

public WebElement getSelectCcType() {
	return selectCcType;
}

public WebElement getSelectCcExpMonth() {
	return selectCcExpMonth;
}

public WebElement getSelectCcExpYear() {
	return selectCcExpYear;
}

public WebElement getTxtCcCvv() {
	return txtCcCvv;
}

public WebElement getClickBookNowBtn() {
	return clickBookNowBtn;
}


}
