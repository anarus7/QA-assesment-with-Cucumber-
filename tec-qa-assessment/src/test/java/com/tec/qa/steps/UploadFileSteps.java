package com.tec.qa.steps;

import com.tec.qa.pages.UploadDownloadPage;
import net.serenitybdd.annotations.Step;

import static org.junit.Assert.assertTrue;

public class UploadFileSteps {
    UploadDownloadPage uploadDownloadPage;

    @Step
    public void openUploadDownloadPage() {
        uploadDownloadPage.open();
    }

    @Step
    public void selectFileToUpload(String filename) {
        uploadDownloadPage.uploadFile(filename);
    }

    @Step
    public void checkFileUploaded(String filename) {
        assertTrue(uploadDownloadPage.getUploadedFilePath().contains(filename));
    }


}
