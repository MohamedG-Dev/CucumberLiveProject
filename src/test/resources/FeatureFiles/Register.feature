Feature: Registration functionality scenarios

  @register @One
  Scenario: Verify whether the user is able to register into the application by providing all the fields
    Given I launch the application
    And I navigate to Account Registration page
    When I provide all the below valide details
      | FirstName | Ravi                  |
      | LastName  | Kumar                 |
      | Email     | kumarravi12@gmail.com |
      | Telephone |            9876504321 |
      | Password  | kumarravi             |
    And I select the privacy policy
    And I click on the continue button
    Then I should see that the user account has successfully registered
