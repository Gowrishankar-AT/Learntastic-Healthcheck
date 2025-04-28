@HealthCheck
Feature: Quick Links in the Footer
  As a user
  I want to view and use the Quick Links in the footer
  So that I can easily access helpful pages on the site

  Background:
    Given User is on the LearnTastic homepage



Scenario: Check navigation for About page "https://learntastic.com/about-us"
  When the user clicks the "About" link in the Quick Links section
  Then the user should be taken to the About page

Scenario: Check navigation for Partners page "https://learntastic.com/our-partners"
  When the user clicks the "Partners" link in the Quick Links section
  Then the user should be taken to the Partners page

Scenario: Check navigation for Reviews page "https://learntastic.com/reviews"
  When the user clicks the "Reviews" link in the Quick Links section
  Then the user should be taken to the Reviews page

Scenario: Check navigation for Blog page "https://learntastic.com/blog"
  When the user clicks the "Blog" link in the Quick Links section
  Then the user should be taken to the Blog page

Scenario: Check navigation for Certificate page "https://learntastic.com/certificate-validation"
  When the user clicks the "Verify Certificate" link in the Quick Links section
  Then the user should be taken to the Certificate Verification page