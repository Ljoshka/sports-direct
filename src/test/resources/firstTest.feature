Feature: sportsdirect.lv registration
  Scenario: Success registration test
    Given user name: "Alex"
    And user last name: "Kos"
    And user email: "qwerty@qwerty.lv"
    And new password is "qwerty9876"

    When we are open browser window
    And we open home page
    And we accept cookies
    And we are pressing Registration - Login button
    And we are open registration form
#    And we are filling in registration form
#
#    Then validation errors count is 0



