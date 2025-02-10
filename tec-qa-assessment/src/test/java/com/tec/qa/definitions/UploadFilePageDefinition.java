package com.tec.qa.definitions;

import com.tec.qa.steps.UploadFileSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class UploadFilePageDefinition {

    @Steps
    UploadFileSteps uploadFileSteps;


    @Given("the user opens the upload page")
    public void openUploadPage() {
        uploadFileSteps.openUploadDownloadPage();
    }

    @When("the user selects the {string} file to upload")
    public void selectFileToUpload(String file) {
        uploadFileSteps.selectFileToUpload(file);
    }

    @Then("the file {string} should be selected for upload")
    public void checkFileUploaded(String fileUploaded) {
        uploadFileSteps.checkFileUploaded(fileUploaded);
    }

}
