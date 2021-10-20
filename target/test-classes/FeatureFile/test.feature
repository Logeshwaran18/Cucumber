Feature: To validate

  Scenario: User validate
    Given User
    When User enter
    Then user should be in invalid credential
      | apple | attribute | mango | orange |
      | aa    | bb        | cc    | dd     |
      |     1 |         2 |     3 |      4 |
      |    11 |        22 |    33 |     44 |
      | ee    | ff        | ii    | kk     |
