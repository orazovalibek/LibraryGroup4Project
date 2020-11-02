package com.library.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id="inputEmail")
    public WebElement username;

    @FindBy(id="inputPassword")
    public WebElement password;

    @FindBy(xpath = "(//span[@class='title'])[2]")
    public WebElement userModule;

    @FindBy (xpath = "//span[@class='title'])[3]")
    public WebElement bookModule;

    public void login(){
        username.sendKeys(ConfigurationReader.getProperty("username"));
        password.sendKeys(ConfigurationReader.getProperty("password"), Keys.ENTER);

    }


}
