Feature: to test login page works when there are no errors

  Scenario: Check page is validated when there are no errors
    Given I am on the dixonstraning wesite
    When I populate the fields
    And I click on Login
    Then I see title "Traning to do..."
    
 @web
    Scenario: Check page2 is validated when there are no errors
     Given I am on the dixonstraning wesite
    When I populate the fields
    And I click on Login
    Then I see title "Traning to do..."
  	When I click on PLC
    Then I should see text "Product Learning Centre"
    
  @app
    Scenario: Check page3 is validated when there are no errors
     Given I am on the dixonstraning wesite
    When I populate the fields
    And I click on Login
    Then I see title "Traning to do..."
  	When I click on MY TRAINING PLAN EXPLAINED
    Then I should see text "My Training Plan Explained"