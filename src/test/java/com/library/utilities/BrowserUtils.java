package com.library.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {


        private static WebDriverWait wait=new WebDriverWait(Driver.getDriver(),20);
        public static void wait(int second){
            try{ Thread.sleep(second*1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        public static void clickOnElement(WebElement element){
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        }

}
