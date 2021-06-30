@Login
Feature: To Validate AdactinHotel Room booking registeration Page

  Background: 
    Given User is in enter Adactin login page

  Scenario: To Validate AdactinHotel Room booking registeration and getting order details
    When User enter Valid username, valid password and click login button
      | username  | password |
      | temp000   | temp000  |
      | daniel001 | temp001  |
      | temp002   | temp002  |
    And User navigate to Search hotel page
    And User to select Location,Hotel,RoomType,NoOfRooms,CheckInDate,CheckOutDate,AdultsPerRoom,ChildPerRoom and click Search button
    And User navigate to Select Hotel page
    And User to select the Searched hotel radio button and Click Continue button
    And User navigate to Book A Hotel page
    And User to enter First Name,Last Name, Billing Address, Creditcard No,ExpDateMonth and Year, CVV Number and click Book Now button
    Then User navigate to Booking Confirmation page
    And User get the Order No

  Scenario: To Validate Adactin Forgot Password
    When User click Forgot Password
    And User pass Required email and Click the Email Password button
    Then User direct to Password sent to mail information Page
