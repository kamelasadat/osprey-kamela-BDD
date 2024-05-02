Feature: Navigate to Accounts and verify 5 rows as default

Background: Setup Account Page Test
   Then Click on Login button And Login with valid username "supervison" and password "tek_supervisor"
   And Click on Sign in button
   And Validate user navigate to Customer Service Portal
   When Click on Accounts Button
@Rows_1
Scenario: Validating accounts page has 5 rows as page's default
    When "5" row as default
    Then 5 data rows must display

  Scenario Outline: Customer Service Portal - Accounts change show per page to
    Then Select Show "<Page per show>" from page per show dropdown
    Then Verify the presence of all "<Visible Rows>" per page

    Examples:
      |Page per show|Visible Rows |
      |Show 10      |10           |
      |Show 25      |25           |
      |Show 50      |50           |