@HealthCheck

Feature: Validate LearnTastic UI Navigation


Scenario: Verify and navigate to the 'Construction' category page "https://learntastic.com/construction"
  Given User is on the LearnTastic homepage
  When User clicks on "Construction"
  Then User should be navigated to the "OSHA 10/30 Card Certification Online | Learntastic" category page

Scenario: Verify and navigate to the 'Healthcare' category page "https://learntastic.com/healthcare"
  Given User is on the LearnTastic homepage
  When User clicks on "Healthcare"
  Then User should be navigated to the "Training Programs for Physicians" category page

Scenario: Verify and navigate to the 'Assisted Living' category page "https://learntastic.com/assisted-living"
  Given User is on the LearnTastic homepage
  When User clicks on "Assisted Living"
  Then User should be navigated to the "Facility Manager Training for Assisted Living" category page

Scenario: Verify and navigate to the 'Therapy' category page "https://learntastic.com/therapy"
  Given User is on the LearnTastic homepage
  When User clicks on "Therapy"
  Then User should be navigated to the "Athletic Trainers - Expert Care for Peak Performance | Learntastic" category page

Scenario: Verify and navigate to the 'Education' category page "https://learntastic.com/education"
  Given User is on the LearnTastic homepage
  When User clicks on "Education"
  Then User should be navigated to the "Online Safety Training & Continuing Education" category page

Scenario: Verify and navigate to the 'Group Discount' page "https://learntastic.com/group-discount"
  Given User is on the LearnTastic homepage
  When User clicks on "Group Discount"
  Then User should be navigated to the group discount details page

Scenario: Verify and navigate to the 'Login' page "https://learntastic.com/login"
  Given User is on the LearnTastic homepage
  When User clicks on "Login"
  Then User should be navigated to the login page

Scenario: Verify and navigate to the 'Cart' page
  Given User is on the LearnTastic homepage
  When User clicks on the "Cart" icon
  Then User should be navigated to the payment and course start page

Scenario: Verify 'Help me choose' pop-up
  Given User is on the LearnTastic homepage
  When User clicks on Help me choose button
  Then User should see a pop-up message Let us help you choose a course

Scenario: Verify 'Join for free' pop-up
  Given User is on the LearnTastic homepage
  When User clicks on Join for free button
  Then User should see a pop-up message "Sign up & start learning"


