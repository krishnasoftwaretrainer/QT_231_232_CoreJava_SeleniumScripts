Feature: Swaglabs Login with multiple test data using Scenario Outline
Scenario: Swaglabs Login with multiple testdata
	Given The user is on the login page
    When The user enters a username "<username>"
    And The user enters a password "<password>"
    And The user clicks the login button
    Then The user should see the result

    Examples:
      | username        | password      |
      | standard_user  | secret_sauce |
      | standard_user   | invalid_password |
      | invalid_username | secret_sauce |
      | invalid_username  | invalid_password |
      | standard_user   |  |
      |  | secret_sauce |
      |  |  |
      
      

