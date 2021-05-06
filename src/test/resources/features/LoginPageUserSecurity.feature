#Autor: MUHAMMED AKCAL(QA AUTOMATION TEST ENGINEER)

# operation to log in everytime for each scenario


Feature: Loging Page System Security Necessary Validations Test

  Scenario: Login with invalid userID and password
    Given I should be at the login page
    And   Sending invalid user name and passwords to the systemas "user1" "password" "User2" "password" "User3" "password" "User4" "password"
    Then  Because of the incorrect information, I should be at the login page.