Feature: To validate login functionalty in a facebook

@smoke
  Scenario: To validate login functionality with valid Username and Invalid Password
    Given user enter into facebook
    When user enter Vusername and INpassword
    And user click login button
    Then user should be in error page
@Regression
  Scenario: To validate login functionality with Invalid Username and Invalid Password
    Given user enter into facebook
    When user enter Inusername and Inpassword
    And user click login button
    Then user should be in error page
@smoke
  Scenario: To validate login functionality with valid Username and valid Password
    Given user enter into facebook
    When user enter Vusername and Vpassword
    And user click login button
    Then user should be in error page
