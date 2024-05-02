Feature: Home page validation

  Scenario: Validate Home page title and Create Primary Account Button
    When navigate to the home page and validate that the title "Tek Insurance UI"
    Then Validate create Primary Account Button is exist
