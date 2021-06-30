package org.locators;

import org.functionallib.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends Baseclass{
public SearchHotelPage() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="location")
private WebElement selectLocation;

@FindBy(id="hotels")
private WebElement selectHotels;

@FindBy(id="room_type")
private WebElement selectRoomType;

@FindBy(id="room_nos")
private WebElement selectNoOfRoom;

@FindBy(id="datepick_in")
private WebElement txtCheckInDate;

@FindBy(id="datepick_out")
private WebElement txtCheckOutDate;

@FindBy(id="adult_room")
private WebElement selectAdultPerRoom;

@FindBy(id="child_room")
private WebElement selectChildPerRoom;


@FindBy(id="Submit")
private WebElement btnHotelSubmit;


public WebElement getSelectLocation() {
	return selectLocation;
}


public WebElement getSelectHotels() {
	return selectHotels;
}


public WebElement getSelectRoomType() {
	return selectRoomType;
}


public WebElement getSelectNoOfRoom() {
	return selectNoOfRoom;
}


public WebElement getTxtCheckInDate() {
	return txtCheckInDate;
}


public WebElement getTxtCheckOutDate() {
	return txtCheckOutDate;
}


public WebElement getSelectAdultPerRoom() {
	return selectAdultPerRoom;
}


public WebElement getSelectChildPerRoom() {
	return selectChildPerRoom;
}


public WebElement getBtnHotelSubmit() {
	return btnHotelSubmit;
}
}
