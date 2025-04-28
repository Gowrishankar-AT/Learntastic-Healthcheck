@HealthCheck

Feature: Help Center section in footer
  As a user
  I want to see and interact with Help Center options
  So that I can access helpful resources and support

  Background:
     Given User is on the LearnTastic homepage




Scenario: Check navigation for About page "https://learntastic.com/about-us"
  When the user clicks the "About" link in the Quick Links section
  Then the user should be taken to the About page

Scenario: Check navigation for Partners page "https://learntastic.com/our-partners"
  When the user clicks the "Partners" link in the Quick Links section
  Then the user should be taken to the Partners page

Scenario: Check navigation to Student Login "https://learntastic.com/login"
  When the user clicks on "Student Login" link
  Then the user should be navigated to the Student Login page

Scenario: Check navigation to Staff Login "https://learntastic.com/login"
  When the user clicks on "Staff Login" link
  Then the user should be navigated to the Staff Login page

Scenario: Check navigation to FAQ "https://learntastic.com/faq"
  When the user clicks on "FAQ" link
  Then the user should be navigated to the FAQ page

Scenario: Check navigation to Contact Us "https://learntastic.com/contact-us"
  When the user clicks on "Contact Us" link
  Then the user should be navigated to the Contact Us page

Scenario: Check navigation to Privacy Policy "https://learntastic.com/privacy-policy"
  When the user clicks on "Privacy Policy" link
  Then the user should be navigated to the Privacy Policy page

Scenario: Check navigation to Refund Policy "https://learntastic.com/refund-policy"
  When the user clicks on "Refund Policy" link
  Then the user should be navigated to the Refund Policy page

Scenario: Check navigation to Terms of Use "https://learntastic.com/terms-of-use"
  When the user clicks on "Terms of Use" link
  Then the user should be navigated to the Terms of Use page