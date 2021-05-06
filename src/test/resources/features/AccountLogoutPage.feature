
#Autor: MUHAMMED AKCAL(QA AUTOMATION TEST ENGINEER)

# operation to log in everytime for each scenario


Feature:About Loggin Out Test

  Scenario:We are checking the account log-out function

    Given Necessary items for login out from the modules
    When  I click on the log-out button
    Then  I verify the account and Url Function