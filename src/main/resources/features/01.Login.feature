Feature: Login User

  Scenario: User valid login
    When User open web Shop Demoqa
    And User click button dismiss
    And User click button my account
    Then User enter email password valid
