#Autor: MUHAMMED AKCAL(QA AUTOMATION TEST ENGINEER)

# operation to log in everytime for each scenario

Feature:About Login Page


  Scenario:We are checking Login Page

    Given Necessary items for going to Login Page
    When The title of Login Page is been tested
    And The url of Login Page is tested
    And The RedColorLoginButton is tested
    And The GreenColorLoginButton is tested
    Then Verify that Login Pages is not from the Test