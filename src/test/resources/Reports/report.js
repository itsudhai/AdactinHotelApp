$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/AdactinSimple.feature");
formatter.feature({
  "name": "To Validate AdactinHotel Room booking registeration Page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in enter Adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinSimpleStepDef.user_is_in_enter_Adactin_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Validate AdactinHotel Room booking registeration and getting order details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "User enter Valid username, valid password and click login button",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "temp000",
        "temp000"
      ]
    },
    {
      "cells": [
        "daniel001",
        "temp001"
      ]
    },
    {
      "cells": [
        "temp002",
        "temp002"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AdactinSimpleStepDef.user_enter_Valid_username_valid_password_and_click_login_button(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to Search hotel page",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinSimpleStepDef.user_navigate_to_Search_hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User to select Location,Hotel,RoomType,NoOfRooms,CheckInDate,CheckOutDate,AdultsPerRoom,ChildPerRoom and click Search button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinSimpleStepDef.user_to_select_Location_Hotel_RoomType_NoOfRooms_CheckInDate_CheckOutDate_AdultsPerRoom_ChildPerRoom_and_click_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to Select Hotel page",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinSimpleStepDef.user_navigate_to_Select_Hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User to select the Searched hotel radio button and Click Continue button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinSimpleStepDef.user_to_select_the_Searched_hotel_radio_button_and_Click_Continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to Book A Hotel page",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinSimpleStepDef.user_navigate_to_Book_A_Hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User to enter First Name,Last Name, Billing Address, Creditcard No,ExpDateMonth and Year, CVV Number and click Book Now button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinSimpleStepDef.user_to_enter_First_Name_Last_Name_Billing_Address_Creditcard_No_ExpDateMonth_and_Year_CVV_Number_and_click_Book_Now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to Booking Confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinSimpleStepDef.user_navigate_to_Booking_Confirmation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User get the Order No",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinSimpleStepDef.user_get_the_Order_No()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in enter Adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinSimpleStepDef.user_is_in_enter_Adactin_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Validate Adactin Forgot Password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "User click Forgot Password",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinSimpleStepDef.user_click_Forgot_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User pass Required email and Click the Email Password button",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinSimpleStepDef.user_pass_Required_email_and_Click_the_Email_Password_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"*[name\u003d\u0027Submi\u0027]\"}\n  (Session info: chrome\u003d91.0.4472.114)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-6J5NAGBU\u0027, ip: \u0027192.168.43.39\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_291\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.114, chrome: {chromedriverVersion: 91.0.4472.101 (af52a90bf870..., userDataDir: C:\\Users\\UDHAYA~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:58232}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 9ba6b7282eda0d98bb6c6850fd3c24be\n*** Element info: {Using\u003dname, value\u003dSubmi}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:404)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:284)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.adactinsimplestepdef.AdactinSimpleStepDef.user_pass_Required_email_and_Click_the_Email_Password_button(AdactinSimpleStepDef.java:151)\r\n\tat ✽.User pass Required email and Click the Email Password button(file:src/test/resources/FeatureFiles/AdactinSimple.feature:24)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User direct to Password sent to mail information Page",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinSimpleStepDef.user_direct_to_Password_sent_to_mail_information_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});