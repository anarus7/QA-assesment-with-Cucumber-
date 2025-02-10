Feature: Select Date from Date picker

  Scenario: User selects new date from Date picker
    Given the user opens the date picker page
#   Date format MM/dd/yyyy
    When the user selects the "09/07/1993" date
    Then the "09/07/1993" date is selected

