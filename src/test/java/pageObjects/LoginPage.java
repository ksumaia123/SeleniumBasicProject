package pageObjects;

import config.CommonUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    @FindBy(id = "user-name")
    WebElement username;
    @FindBy(id = "password" )
    WebElement password;
    @FindBy(id = "login-button")
    WebElement loginButton;

//create constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String usernamefield){
        CommonUtility.sendkeys(driver, username, usernamefield);
    }
    public void enterPassword(String passwordfield){
        CommonUtility.sendkeys(driver,password,passwordfield);
    }
    public void clickLoginButton(){
        CommonUtility.ClickElement(driver,loginButton);
    }
}
