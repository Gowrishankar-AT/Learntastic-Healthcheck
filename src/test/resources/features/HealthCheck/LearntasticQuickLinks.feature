
@HealthCheck
Feature: Quick Links in the Footer
  As a user
  I want to view and use the Quick Links in the footer
  So that I can easily access helpful pages on the site

  Background:
    Given User is on the LearnTastic homepage

  Scenario: Check visibility of Quick Links section
    Then the user should see the Quick Links section in the footer
    And it should include the following links:
      | About              |
      | Partners           |
      | Reviews            |
      | Blog               |
      | Verify Certificate |

  Scenario: Check navigation for About page
    When the user clicks the "About" link in the Quick Links section
    Then the user should be taken to the About page

 Scenario: Check navigation for Partners page
    When the user clicks the "Partners" link in the Quick Links section
    Then the user should be taken to the Partners page

 Scenario: Check navigation for Reviews page
    When the user clicks the "Reviews" link in the Quick Links section
    Then the user should be taken to the Reviews page

 Scenario: Check navigation for Blog page
    When the user clicks the "Blog" link in the Quick Links section
    Then the user should be taken to the Blog page

 Scenario: Check navigation for Certificate page
    When the user clicks the "Verify Certificate" link in the Quick Links section
    Then the user should be taken to the Certificate Verification page
