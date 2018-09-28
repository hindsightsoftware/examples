Feature: Doc String Example

  # Supporting code can be found at:
  # https://github.com/hindsightsoftware/examples/blob/master/java/src/test/java/stepdefinitions/DocStringStepsExample.java

  Scenario: Demonstrating Doc Strings
    Given I have filled in the address details form
    When I submit the form
    Then the address is processed and I receive the message
      """
      Thank you for your submission
  ​
      We will be in touch
      """