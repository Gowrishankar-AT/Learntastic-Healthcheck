@HealthCheck
@Courses

Feature: LearnTastic Courses Navigation
  Background:
     Given User is on the LearnTastic homepage

# Healthcare Courses

Scenario: Navigate to Physicians course page "https://learntastic.com/healthcare/physicians"
  When the user clicks on the "Physicians" link under Healthcare section
  Then the user should be taken to the Physicians course page

Scenario: Navigate to Pharmacist course page "https://learntastic.com/healthcare/pharmacist"
  When the user clicks on the "Pharmacist" link under Healthcare section
  Then the user should be taken to the Pharmacist course page

Scenario: Navigate to Registered Nurse course page "https://learntastic.com/healthcare/registered-nurse"
  When the user clicks on the "Registered Nurse" link under Healthcare section
  Then the user should be taken to the Registered Nurse course page

Scenario: Navigate to Nurse Practitioner course page "https://learntastic.com/healthcare/nurse-practitioner"
  When the user clicks on the "Nurse Practitioner" link under Healthcare section
  Then the user should be taken to the Nurse Practitioner course page

# Assisted Living Courses

Scenario: Navigate to Assisted Living Facility Manager course page "https://learntastic.com/assisted-living/assisted-living-facility-manager"
  When the user clicks on the "Assisted Living Facility Manager" link under Assisted Living section
  Then the user should be taken to the Assisted Living Facility Manager course page

Scenario: Navigate to Assisted Living Nursing course page "https://learntastic.com/assisted-living/assisted-living-nursing"
  When the user clicks on the "Assisted Living Nursing" link under Assisted Living section
  Then the user should be taken to the Assisted Living Nursing course page

Scenario: Navigate to Caregivers course page "https://learntastic.com/assisted-living/caregivers"
  When the user clicks on the "Caregivers" link under Assisted Living section
  Then the user should be taken to the Caregivers course page

Scenario: Navigate to ALF Training course page "https://learntastic.com/assisted-living/alf-training"
  When the user clicks on the "ALF Training" link under Assisted Living section
  Then the user should be taken to the ALF Training course page

# Therapy Courses

Scenario: Navigate to Athletic Trainers course page "https://learntastic.com/therapy/athletic-trainers"
  When the user clicks the "Athletic Trainers" course link
  Then the user should be taken to the Athletic Trainers course page

Scenario: Navigate to Massage Therapy course page "https://learntastic.com/therapy/massage-therapy"
  When the user clicks the "Massage Therapy" course link
  Then the user should be taken to the Massage Therapy course page

Scenario: Navigate to Occupational Therapy course page "https://learntastic.com/therapy/occupational-therapy"
  When the user clicks the "Occupational Therapy" course link
  Then the user should be taken to the Occupational Therapy course page

Scenario: Navigate to Physical Therapy course page "https://learntastic.com/therapy/physical-therapy"
  When the user clicks the "Physical Therapy" course link
  Then the user should be taken to the Physical Therapy course page
