package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    private static String XPATH_INPUT_DAY = "//*[@id=\"day\"]";
    private static String XPATH_INPUT_MONTH = "//*[@id=\"month\"]";
    private static String XPATH_INPUT_YEAR = "//*[@id=\"year\"]";

    public static void main(String[] args) {
        WebDriver webDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        webDriver.get("https://www.facebook.com/");

        WebElement selectDay = webDriver.findElement(By.xpath(XPATH_INPUT_DAY));
        Select selectD = new Select(selectDay);
        selectD.selectByIndex(8);

        WebElement selectMonth = webDriver.findElement(By.xpath(XPATH_INPUT_MONTH));
        Select selectM = new Select(selectMonth);
        selectM.selectByIndex(2);

        WebElement selectYear = webDriver.findElement(By.xpath(XPATH_INPUT_YEAR));
        Select selectY = new Select(selectYear);
        selectY.selectByIndex(26);
    }
}
