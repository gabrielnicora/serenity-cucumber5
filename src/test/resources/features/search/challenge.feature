Feature: GoalSetter Challenge

  Scenario: Send a goalcard to an already existent kid
    Given I am on the GoalSetter home page
    When click on button "GIVE GOALCARD"
    And select goal card motive "Smart small Dream Big"
    And Set 50 dollars on the Fun Fund goal input field
    And Set 10 dollars on the savings goal input field
    And Set who the card is from name
    And Set sender email by creating a random email address
    And Navigate to purchase Screen
    And Set a cardholder's full name
    #No pude impleemntar estos pasos, me trabe con un error del site luego del click
    And Set debit card number as: 4242 4242 4242 4242
    And Set expiration date: 04/24
    And Set CVC: 242
    And Set ZIP 50001
    And Pay for the goalcard

  Scenario:backend assertions
    Given post request to API and validate code 200 and Print Token