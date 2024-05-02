
Feature: Create an Account from home page.

Background:
    When User click on Create Primary Account button

Scenario: Create an Account
   And User Validates Page Title as Expected "<Create Primary Account Holder>"

Scenario: Create an Account by filling up the form using List of Map Data Table
    When User fill out Create Account Form
| email|   title   | firstName|   lastName|  gender   |maritalStatus| employmentStatus|  dataOfBirth|
|kamela.sadat@gmail.com| Mr.  |Hamza| Sana|  Male |  Single|      Developer       | 02/03/2023    |


    When User click on Create Account Button
    And Validate user is on "<Sign up your account>"
    Then Email displayed as entered

Scenario: Create an account with existing email address
     When User Creates an ccount with existing email address
|email|title|firstName|LastName|gender|maritalStatus|employmentStatus|date0fBirth|
|kamela.sadat@gmail.com| Mr.|Hamza| Sana |Male |Single |Engineer     |02/03/2023 |

     Then Click on Create Account Button
     Then Error message "<Account with email kamela.sadat@gmail.com is exist>"