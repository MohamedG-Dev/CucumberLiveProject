Feature: Registration functionality scenarios

  @register @One
  Scenario: Verify whether the user is able to register into the application by providing all the fields
    Given I launch the application
    And I navigate to Account Registration page
    When I provide all the below valid details
      | FirstName | Ravi                   |
      | LastName  | Kumar                  |
      | Email     | kumarravi112@gmail.com |
      | Telephone |             9876504321 |
      | Password  | kumarravi              |
    And I select the privacy policy
    And I click on the continue button
    Then I should see that the user account has successfully registered

  @register @Two
  Scenario: Verify whether the user is not allowed to register on skipping mandatory fields
    Given I launch the application
    And I navigate to Account Registration page
    When I click on the continue button
    Then I should see that the user account is not created
    And I should see the error messages informing the user to fill the mandatory fields

  @register @Three
  Scenario: Verify whether the user is able to register into the application by opting for Newsletter subscription
    Given I launch the application
    And I navigate to Account Registration page
    When I provide all the below valid details
      | FirstName | Sachin              |
      | LastName  | Tambe               |
      | Email     | sachin123@gmail.com |
      | Telephone |            34567543 |
      | Password  | tambesachin         |
    And I subscribe to Newsletter
    And I select the privacy policy
    And I click on the continue button
    Then I should see that the user account has successfully registered

  @register @Four
  Scenario: Verify whether the user is registered from registering a duplicate account
    Given I launch the application
    And I navigate to Account Registration page
    When I provide the below duplicate details into the fields
      | FirstName | Ravi                  |
      | LastName  | Kiran                 |
      | Email     | Ravi.Kiran1@gmail.com |
      | Telephone |            9212345678 |
      | Password  | kiranravi             |
    And I select the privacy policy
    And I click on the continue button
    Then I should see the warning message stating that the user is already created
