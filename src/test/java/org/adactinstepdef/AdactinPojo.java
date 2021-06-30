package org.adactinstepdef;

import java.io.IOException;
import org.functionallib.Baseclass;
import org.junit.Assert;
import org.locators.BookHotelPage;
import org.locators.LoginPage;
import org.locators.SearchHotelPage;
import org.locators.SelectHotelPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

public class AdactinPojo extends Baseclass {
	public LoginPage lp;

	@Given("User is in enter Adactin login page")
	public void user_is_in_enter_Adactin_login_page() {
		chromeBrower();
		maxWindow();
		launchUrl("http://adactinhotelapp.com/");

	}

	@When("User enter Valid username and valid password")
	public void user_enter_Valid_username_and_valid_password() {
		lp = new LoginPage();
		lp.getTxtUser().sendKeys("daniel001");
		fillTheTextBox(lp.getTxtPassword(), "temp001");
	}

	@When("User to click login button")
	public void user_to_click_login_button() {

		lp.getBtnLogin().click();
	}

	@When("User navigate to Search hotel page")
	public void user_navigate_to_Search_hotel_page() {

		String title = driver.getTitle();
		if (title.contains("Search")) {
			Assert.assertTrue("Current Page Title", title.contains("Search"));
			System.out.println(title + "\n");

		} else {
			System.out.println("Invalid Page");
		}

	}

	public SearchHotelPage shp;

	@When("User to select Location from Drop down")
	public void user_to_select_Location_from_Drop_down() {
		shp = new SearchHotelPage();
		s = new Select(shp.getSelectLocation());
		s.selectByIndex(2);

	}

	@When("User to select Hotel from Drop down")
	public void user_to_select_Hotel_from_Drop_down() {
		s = new Select(shp.getSelectHotels());
		s.selectByIndex(1);
	}

	@When("User to select Room type from Drop down")
	public void user_to_select_Room_type_from_Drop_down() {
		s = new Select(shp.getSelectRoomType());
		s.selectByIndex(2);
	}

	@When("User to select Number of Rooms from Drop down")
	public void user_to_select_Number_of_Rooms_from_Drop_down() {
		s = new Select(shp.getSelectNoOfRoom());
		s.selectByIndex(1);
	}

	@When("User to select Check In Date")
	public void user_to_select_Check_In_Date() {

		jseInsert("26/06/2021", shp.getTxtCheckInDate());
	}

	@When("User to select Check Out Date")
	public void user_to_select_Check_Out_Date() throws Throwable {
		findTheElement("id", "datepick_out");
		jseInsert("27/06/2021", shp.getTxtCheckOutDate());
		sleep(10000);
	}

	@When("User to select Adults per Room from Drop down")
	public void user_to_select_Adults_per_Room_from_Drop_down() {

		s = new Select(shp.getSelectAdultPerRoom());
		s.selectByIndex(2);
	}

	@When("User to select Children per Room from Drop down")
	public void user_to_select_Children_per_Room_from_Drop_down() {

		s = new Select(shp.getSelectChildPerRoom());
		s.selectByIndex(2);
	}

	@When("User to click Search button")
	public void user_to_click_Search_button() {
		buttonClick(shp.getBtnHotelSubmit());

	}

	@When("User navigate to Select Hotel page")
	public void user_navigate_to_Select_Hotel_page() {
		String title = driver.getTitle();
		Assert.assertTrue("Current Page Title", title.contains("Select"));
		System.out.println(title + "\n");
		}

	@When("User to select the searched hotel radio button")
	public void user_to_select_the_searched_hotel_radio_button() {
		// findTheElement("id", "radiobutton_0");
		SelectHotelPage sp = new SelectHotelPage();
		buttonClick(sp.getClickRadioButton());
	}

	@When("User to click Continue button")
	public void user_to_click_Continue_button() {
		findTheElement("id", "continue");
		buttonClick(element);

	}

	@When("User navigate to Book A Hotel page")
	public void user_navigate_to_Book_A_Hotel_page() {
		String title = driver.getTitle();
		Assert.assertTrue("Current Page Title", title.contains("Book"));
		System.out.println(title + "\n");

	}

	public BookHotelPage bhp;

	@When("User to enter First Name and Last Name")
	public void user_to_enter_First_Name_and_Last_Name() {
		bhp = new BookHotelPage();
		fillTheTextBox(bhp.getTxtFstName(), "Daniel");
		fillTheTextBox(bhp.getTxtLstName(), "Kav");
	}

	@When("User to enter Billing Address")
	public void user_to_enter_Billing_Address() {
		fillTheTextBox(bhp.getTxtAddress(), "Daniel House\n" + "Hilton");

	}

	@When("User to enter Credit Card No and Should be Sixteen digit")
	public void user_to_enter_Credit_Card_No_and_Should_be_Sixteen_digit() {
		fillTheTextBox(bhp.getTxtCcNum(), "1234567898745123");

	}

	@When("User to select Credit Card Type")

	public void user_to_select_Credit_Card_Type() {
		selByIndex(bhp.getSelectCcType(), 2);
	}

	@When("User to select Expiry Date by Month and Year")
	public void user_to_select_Expiry_Date_by_Month_and_Year() {
		selByIndex(bhp.getSelectCcExpMonth(), 6);
		selByIndex(bhp.getSelectCcExpYear(), 10);
	}

	@When("User to enter CVV Number")
	public void user_to_enter_CVV_Number() {
		fillTheTextBox(bhp.getTxtCcCvv(), "123");

	}

	@When("User click Book Now button")
	public void user_click_Book_Now_button() {
		buttonClick(bhp.getClickBookNowBtn());
		
	}

	@Then("User navigate to Booking Confirmation page")
	public void user_navigate_to_Booking_Confirmation_page() {
		String title = driver.getTitle();
		Assert.assertTrue("Current Page Title", title.contains("Booking"));
		System.out.println(title + "\n");

	}

	@Then("User get the Order No")
	public void user_get_the_Order_No() throws IOException {
		findTheElement("id", "order_no");
		String order_no = element.getAttribute("value");
		System.out.println("Booking Order No: " + order_no);
		jseScrollUp(element);
		takeScreenShot("date");

	}

}
