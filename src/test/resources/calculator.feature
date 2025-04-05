Feature: Calculator
  Scenario: Some calculation check
    Given first number: 20
    And second number: 4

    When two number are summed
    Then result must be 24

    When we multiply two numbers
    Then  result must be 80
