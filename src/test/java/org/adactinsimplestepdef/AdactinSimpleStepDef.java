package org.adactinsimplestepdef;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.functionallib.Baseclass;
import org.locators.BookHotelPage;
import org.locators.LoginPage;
import org.locators.SearchHotelPage;
import org.locators.SelectHotelPage;
import org.openqa.selenium.By;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import io.cucumber.datatable.DataTable;

@SuppressWarnings("deprecation")
public class AdactinSimpleStepDef extends Baseclass {
	@Given("User is in enter Adactin login page")
	public void user_is_in_enter_Adactin_login_page() {
		launchUrl("http://adactinhotelapp.com/");

	}

	public LoginPage lp;

	@When("User enter Valid username, valid password and click login button")
	public void user_enter_Valid_username_valid_password_and_click_login_button(DataTable dataTable) {
		lp = new LoginPage();

		List<Map<String, String>> maps = dataTable.asMaps();
		Map<String, String> map = maps.get(1);
		String user = map.get("username");
		String pass = map.get("password");
		fillTheTextBox(lp.getTxtUser(), user);
		fillTheTextBox(lp.getTxtPassword(), pass);
		buttonClick(lp.getBtnLogin());
	}

	@When("User navigate to Search hotel page")
	public void user_navigate_to_Search_hotel_page() {

		String title = getTheTitle();
		if (title.contains("Search")) {
			Assert.assertTrue("Current Title", title.contains("Search"));
			System.out.println(title);
		} else {
			System.out.println("Login with Valid Username/Password");
		}

	}

	@When("User to select Location,Hotel,RoomType,NoOfRooms,CheckInDate,CheckOutDate,AdultsPerRoom,ChildPerRoom and click Search button")
	public void user_to_select_Location_Hotel_RoomType_NoOfRooms_CheckInDate_CheckOutDate_AdultsPerRoom_ChildPerRoom_and_click_Search_button() {
		SearchHotelPage shp = new SearchHotelPage();
		selByIndex(shp.getSelectLocation(), 1);
		selByIndex(shp.getSelectHotels(), 2);
		selByIndex(shp.getSelectRoomType(), 3);
		selByIndex(shp.getSelectNoOfRoom(), 1);
		selByIndex(shp.getSelectAdultPerRoom(), 1);
		selByIndex(shp.getSelectChildPerRoom(), 0);
		//jseInsert("29/06/2021", shp.getTxtCheckInDate());
		//jseInsert("30/06/2021", shp.getTxtCheckOutDate());
		shp.getTxtCheckInDate().clear();
		shp.getTxtCheckInDate().sendKeys("30/06/2021");
		shp.getTxtCheckOutDate().clear();
		shp.getTxtCheckOutDate().sendKeys("01/07/2021");
				
		buttonClick(shp.getBtnHotelSubmit());
	}

	@When("User navigate to Select Hotel page")
	public void user_navigate_to_Select_Hotel_page() {
		String title = getTheTitle();
		if (title.contains("Select")) {
			Assert.assertTrue("Current Title", title.contains("Select"));
			System.out.println(title);
		} else {
			System.out.println("Please fill valid details");
		}
	}

	@When("User to select the Searched hotel radio button and Click Continue button")
	public void user_to_select_the_Searched_hotel_radio_button_and_Click_Continue_button() {
		SelectHotelPage sp = new SelectHotelPage();
		buttonClick(sp.getClickRadioButton());
		findTheElement("id", "continue");
		buttonClick(element);
	}

	@When("User navigate to Book A Hotel page")
	public void user_navigate_to_Book_A_Hotel_page() {
		String title = getTheTitle();
		if (title.contains("Book")) {
			Assert.assertTrue("Current Title", title.contains("Book"));
			System.out.println(title);
		} else {
			System.out.println("Please Select the Hotel");
		}
	}

	@When("User to enter First Name,Last Name, Billing Address, Creditcard No,ExpDateMonth and Year, CVV Number and click Book Now button")
	public void user_to_enter_First_Name_Last_Name_Billing_Address_Creditcard_No_ExpDateMonth_and_Year_CVV_Number_and_click_Book_Now_button()
			throws IOException {
		BookHotelPage bhp = new BookHotelPage();
		fillTheTextBox(bhp.getTxtFstName(), readExcel(1, 1));
		fillTheTextBox(bhp.getTxtLstName(), readExcel(1, 2));
		fillTheTextBox(bhp.getTxtAddress(), readExcel(1, 3));
		fillTheTextBox(bhp.getTxtCcNum(), readExcel(1, 4));
		fillTheTextBox(bhp.getTxtCcCvv(), "123");
		selByIndex(bhp.getSelectCcType(), 2);
		selByIndex(bhp.getSelectCcExpMonth(), 5);
		selByIndex(bhp.getSelectCcExpYear(), 10);
		buttonClick(bhp.getClickBookNowBtn());

	}

	@Then("User navigate to Booking Confirmation page")
	public void user_navigate_to_Booking_Confirmation_page() throws Throwable {
		sleep(10000);
		String title = getTheTitle();

		Assert.assertTrue("Current Page Title", title.contains("Booking"));
		System.out.println(title + "\n");

	}

	@Then("User get the Order No")
	public void user_get_the_Order_No() throws IOException {
		findTheElement("id", "order_no");
		jseScrollUp(element);
		String data = element.getAttribute("value");
		System.out.println(data);
		write2Excel("order", 0, 1, "Order_No");
		write2Excel("order", 0, 2, data);

		takeScreenShot("date");
	}

	
	@When("User click Forgot Password")
	public void user_click_Forgot_Password() {
	   findTheElement("xpath", "//a[contains(text(),'Forgot')]");
	   buttonClick(element);
	}

	@When("User pass Required email and Click the Email Password button")
	public void user_pass_Required_email_and_Click_the_Email_Password_button() {
	    findTheElementToFill("id", "emailadd_recovery", "temp0001@gre.com");
	buttonClick(driver.findElement(By.name("Submit")));
	}

	@Then("User direct to Password sent to mail information Page")
	public void user_direct_to_Password_sent_to_mail_information_Page() {
	   System.out.println("User Direct to Password Sent Pop-up");
	}
}
