Feature: Verify user is able to navigate on the Sky News Website
  
  As an iOS user
  I want to be able to 
  navigate on the Sky News website

  @navpg @ios
  Scenario: Verify user is able to navigate on the site
    Given I navigate to the sky news site
    When the home page is loaded and displayed
    Then I can navigate to other pages using the tabs