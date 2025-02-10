Feature: Select value from dropdown

  Scenario: User selects a value from a  multi select dropdown
    Given the user opens the select-menu page
    Then the user should be on the "select-menu" page
    When the user clicks on the "Multiselect drop down"
    Then  "4" options are displayed
    When the user selects "Blue"  from the dropdown
    Then "Blue" is displayed in the dropdown input field