package com.library.pages;

import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

    @FindBy(id = "inputEmail")
    private WebElement usernameInput;

    @FindBy(id = "inputPassword")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id='navbarDropdown']")
    private WebElement loggedUserAvatarNameElement;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    private WebElement logoutElement;





    public LoginPage(){ PageFactory.initElements(Driver.getDriver(), this); }

    public void login(){
        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password, Keys.ENTER);
    }



    public void logout(){

        loggedUserAvatarNameElement.click();
        logoutElement.click();

    }


}
