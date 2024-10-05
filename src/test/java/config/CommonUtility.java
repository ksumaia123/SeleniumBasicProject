package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtility {
    public static WebElement waitForElementToBeVisible(WebDriver driver, WebElement element, init timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        return
                wait.until(ExpectedConditions.visibilityOf(element));

    }
    public static void ClickElement(WebDriver driver, WebElement element){
        waitForElementToBeVisible(driver,element,10);
        element.click();
    }
    public static void sendkeys(WebDriver driver, WebElement element, String text){
        waitForElementToBeVisible(driver,element,10);
        element.clear();
        element.sendKeys(text);
    }
}