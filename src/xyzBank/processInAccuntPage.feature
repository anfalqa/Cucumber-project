Feature: Test functionality 

  Scenario: TO Add one Deposit process and withdraw the amount that have been added
  
    Given Add random amount to Deposit process then withdraw the same random amount
    When use java concepts to add random amount
    And use java concepts to withdraw the random amount 
    Then the amount should added to the balance and the amount should decrease in the balance  
    