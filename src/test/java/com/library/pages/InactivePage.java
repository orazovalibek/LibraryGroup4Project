package com.library.pages;

import com.library.utilities.BrowserUtils;
import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InactivePage {


    @FindBy(xpath = "//*[@id='navbarCollapse']/ul/li[2]")
    public WebElement userModule;

    @FindBy(id = "user_status")
    public WebElement selectInActivedropdown;

    @FindBy(xpath = "//table[@id='tbl_users']/tbody/tr/td[6]")
    public WebElement currentTableStatus;


    public InactivePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public void userModulePage() {

        BrowserUtils.wait(2);
        userModule.click();
    }


    public void selectinActivefromdropdownpage() {

        BrowserUtils.wait(2);
        selectInActivedropdown.click();
    }

    public void setSelectInActivedropdown() {
        BrowserUtils.wait(2);
        Select select = new Select(selectInActivedropdown);
        select.selectByVisibleText("INACTIVE");
    }

    public void getInactvieText() {
        BrowserUtils.wait(2);
        Select select = new Select(selectInActivedropdown);
        select.selectByVisibleText("INACTIVE");


    }


}









