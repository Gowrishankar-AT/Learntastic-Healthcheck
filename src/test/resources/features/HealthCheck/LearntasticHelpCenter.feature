
@HealthCheck

Feature: Help Center section in footer
  As a user
  I want to see and interact with Help Center options
  So that I can access helpful resources and support

  Background:
     Given User is on the LearnTastic homepage

  Scenario: Verify visibility of Help Center section
    Then the user should see the Help Center section in the footer
    And the Help Center section should contain:
      | Student Login  |
      | Staff Login    |
      | FAQ            |
      | Contact Us     |
      | Privacy Policy |
      | Refund Policy  |
      | Terms of Use   |

    Scenario: Check navigation for About page
    When the user clicks the "About" link in the Quick Links section
    Then the user should be taken to the About page

  Scenario: Check navigation for Partners page
    When the user clicks the "Partners" link in the Quick Links section
    Then the user should be taken to the Partners page

  Scenario: Check navigation to Student Login
    When the user clicks on "Student Login" link
    Then the user should be navigated to the Student Login page

  Scenario: Check navigation to Staff Login
    When the user clicks on "Staff Login" link
    Then the user should be navigated to the Staff Login page

  Scenario: Check navigation to FAQ
    When the user clicks on "FAQ" link
    Then the user should be navigated to the FAQ page

  Scenario: Check navigation to Contact Us
    When the user clicks on "Contact Us" link
    Then the user should be navigated to the Contact Us page

  Scenario: Check navigation to Privacy Policy
    When the user clicks on "Privacy Policy" link
    Then the user should be navigated to the Privacy Policy page

  Scenario: Check navigation to Refund Policy
    When the user clicks on "Refund Policy" link
    Then the user should be navigated to the Refund Policy page

  Scenario: Check navigation to Terms of Use
    When the user clicks on "Terms of Use" link
    Then the user should be navigated to the Terms of Use page