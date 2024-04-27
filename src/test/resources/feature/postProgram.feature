Feature: Validation of Program Page
  Scenario: Validation of add a new program button
    Given Admin is on manage program page
    When Admin clicks on add a new program button
    Then Admin should see popup window with title "Program Details"

    Scenario: Validation of save button on Program Details popup window
      Given Admin is on program details popup window after clicking add a new program button
      When Admin click save button after inputting valid credentials
      Then Admin should see a message "Manage Program"


