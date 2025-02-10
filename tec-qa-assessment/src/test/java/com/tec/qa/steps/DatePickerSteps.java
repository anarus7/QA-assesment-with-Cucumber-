package com.tec.qa.steps;

import com.tec.qa.pages.DatePickerPage;
import net.serenitybdd.annotations.Step;

import java.time.LocalDate;

import static com.tec.qa.utility.UtilityClass.DATE_FORMAT;
import static org.junit.Assert.assertEquals;

public class DatePickerSteps {
    DatePickerPage datePickerPage;

    @Step
    public void openDatePickerPage() {
        datePickerPage.open();
    }


    @Step
    public void clickOnDatePicker() {
        datePickerPage.clickOnDatePicker();
    }

    @Step
    public void selectDate(String dateToSelect) {
        LocalDate dateObject = LocalDate.parse(dateToSelect, DATE_FORMAT);
        datePickerPage.selectYear(dateObject.getYear());
        datePickerPage.selectMonth(dateObject.getMonthValue());
        datePickerPage.selectDay(dateObject.getDayOfMonth());
    }

    @Step
    public void checkSelectedDate(String dateToSelect) {
        LocalDate datePickerValue = LocalDate.parse(datePickerPage.getDatePickerValue(), DATE_FORMAT);
        LocalDate expectedDate = LocalDate.parse(dateToSelect, DATE_FORMAT);
        assertEquals(expectedDate, datePickerValue);
    }

}
