package com.tec.qa.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

@DefaultUrl("https://demoqa.com/date-picker")
public class DatePickerPage extends PageObject {

    public void clickOnDatePicker() {
        getDatePickerElement().click();
    }

    public String getDatePickerValue() {
        return getDatePickerElement().getDomAttribute("value");
    }

    public void selectYear(Integer year) {
        WebElement yearDropdown = getDriver().findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
        Select select = new Select(yearDropdown);
        select.selectByValue(year.toString());
    }

    public void selectMonth(Integer month) {
        WebElement monthDropdown = getDriver().findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
        Select select = new Select(monthDropdown);
        select.selectByIndex(month - 1);
    }

    public void selectDay(Integer dayOfMonth) {
        WebElement dayToSelect = getDriver().findElement(By.xpath(String.format("//div[contains(@class, 'react-datepicker__day') and text()='%s']", dayOfMonth)));
        dayToSelect.click();
    }

    public WebElement getDatePickerElement() {
        return getDriver().findElement(By.xpath("//input[@id='datePickerMonthYearInput']"));
    }

}
