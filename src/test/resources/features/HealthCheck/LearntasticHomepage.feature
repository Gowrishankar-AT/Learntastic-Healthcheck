@HealthCheck

Feature: Validate LearnTastic UI Navigation

  Scenario: Verify and navigate to the 'Construction' category page
    Given User is on the LearnTastic homepage
    When User clicks on "Construction"
    Then User should be navigated to the "OSHA 10/30 Card Certification Online | Learntastic" category page

  Scenario: Verify and navigate to the 'Healthcare' category page
    Given User is on the LearnTastic homepage
    When User clicks on "Healthcare"
    Then User should be navigated to the "Training Programs for Physicians" category page

  Scenario: Verify and navigate to the 'Assisted Living' category page
    Given User is on the LearnTastic homepage
    When User clicks on "Assisted Living"
    Then User should be navigated to the "Facility Manager Training for Assisted Living" category page

  Scenario: Verify and navigate to the 'Therapy' category page
    Given User is on the LearnTastic homepage
    When User clicks on "Therapy"
    Then User should be navigated to the "Athletic Trainers - Expert Care for Peak Performance | Learntastic" category page

  Scenario: Verify and navigate to the 'Education' category page
    Given User is on the LearnTastic homepage
    When User clicks on "Education"
    Then User should be navigated to the "Online Safety Training & Continuing Education" category page

  Scenario: Verify and navigate to the 'Group Discount' page
    Given User is on the LearnTastic homepage
    When User clicks on "Group Discount"
    Then User should be navigated to the group discount details page

  Scenario: Verify and navigate to the 'Login' page
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
   
    Scenario: Verify 'Resources' dropdown
    Given User is on the LearnTastic homepage
    When User clicks on Resources dropdown
    Then User should see "About Us", "Reviews", "FAQ", and "Verify Certificate"
 
    @AllIndustries
    Scenario: Verify 'All Industries' dropdown
    Given User is on the LearnTastic homepage
    When User clicks on All Industries dropdown
    Then User should see "Construction", "Healthcare", "Assisted Living", "Therapy", "Education", and "HR & Compliance" options

  #Scenario: Verify 'All Courses' dropdown
    #Given User is on the LearnTastic homepage
    #When User clicks on All Courses dropdown
    #Then User should see "CONSTRUCTION", "HEALTHCARE", "ASSISTED LIVING", "THERAPY", "EDUCATION", and "HR & COMPLIANCE" options
    