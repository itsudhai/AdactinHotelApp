Feature: To Validate AdactinHotel Room booking registeration Page

  Scenario: To Validate AdactinHotel Room booking registeration and getting order details
    Given User is in enter Adactin login page
    When User enter Valid username and valid password
    And User to click login button
    And User navigate to Search hotel page
    And User to select Location from Drop down
    And User to select Hotel from Drop down
    And User to select Room type from Drop down
    And User to select Number of Rooms from Drop down
    And User to select Check In Date
    And User to select Check Out Date
    And User to select Adults per Room from Drop down
    And User to select Children per Room from Drop down
    And User to click Search button
    And User navigate to Select Hotel page
    And User to select the searched hotel radio button
    And User to click Continue button
    And User navigate to Book A Hotel page
    And User to enter First Name and Last Name
    And User to enter Billing Address
    And User to enter Credit Card No and Should be Sixteen digit
    And User to select Credit Card Type
    And User to select Expiry Date by Month and Year
    And User to enter CVV Number
    And User click Book Now button
    Then User navigate to Booking Confirmation page
    And User get the Order No