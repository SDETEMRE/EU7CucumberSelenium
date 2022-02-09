@navigate
Feature: Navigation Menu

  @db
  Scenario: Navigating Fleet -- Vehicles
    Given  the user is on the login page
    And the user enters the sales manager information
    When the user navigates to Fleet, Vehicles
    Then  user should see vehicles page

    @db
    Scenario: Navigating Marketing -- Campaigns
      Given  the user is on the login page
      And the user enters the sales manager information
      When user navigates to Marketing, Campaigns
      Then  user should see Campaigns

      Scenario:Navigating Activities -- Calendar Events
        Given  the user is on the login page
        And the user enters the sales manager information
        When the user navigates to Activities, Calendar Events
        Then title should be Calendars