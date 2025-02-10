Feature: Upload file on Upload Page

  Scenario: User uploads a file on the page
    Given the user opens the upload page
    When the user selects the "test.txt" file to upload
    Then the file "test.txt" should be selected for upload

