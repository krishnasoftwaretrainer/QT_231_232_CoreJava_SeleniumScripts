Feature: Swaglabs Login with Hooks
Scenario: Swaglabs Login with valid, invalid, blank testdata
	When The user enters "<username>" and "<password>"
    And The clicks the login 
    Then The user should see the actuval result

    Examples:
      | username        | password      |
      | standard_user  | secret_sauce |
      | standard_user   | invalid_password |
      | invalid_username | secret_sauce |
      | invalid_username  | invalid_password |
      | standard_user   |  |
      |  | secret_sauce |
      |  |  |
      
      

