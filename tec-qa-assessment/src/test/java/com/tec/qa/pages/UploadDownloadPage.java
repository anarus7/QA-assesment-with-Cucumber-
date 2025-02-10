package com.tec.qa.pages;


import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.io.File;

@DefaultUrl("https://demoqa.com/upload-download")
public class UploadDownloadPage extends PageObject {

    public void uploadFile(String fileName) {
        File file = new File("src/test/resources/files/" + fileName);
        String path = file.getAbsolutePath();
        WebElementFacade fileInput = find(By.xpath("//input[@type='file']"));
        fileInput.sendKeys(path);
    }

    public String getUploadedFilePath() {
        WebElementFacade uploadedFileElement = find(By.id("uploadedFilePath"));
        return uploadedFileElement.getText();
    }
}
