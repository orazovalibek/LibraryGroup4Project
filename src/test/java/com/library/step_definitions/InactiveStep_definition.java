package com.library.step_definitions;

import com.library.pages.InactivePage;
import com.library.pages.LoginPage;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class InactiveStep_definition {
    InactivePage inactivePage = new InactivePage();
    LoginPage loginPage = new LoginPage();

    @Given("user is logged in as a librarian")
    public void user_is_logged_in_as_a_librarian() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
        loginPage.login();
    }

    @When("user clicks on users module")
    public void user_clicks_on_users_module() {

        inactivePage.userModulePage();

    }

    @When("when user select InActive from dropdown")
    public void when_user_select_in_active_from_dropdown() throws InterruptedException {

        //inactivePage.selectinActivefromdropdownpage();
        inactivePage.setSelectInActivedropdown();
    }

    @Then("user should be able to see {string} text in dropdown box")
    public void user_should_be_able_to_see_text_in_dropdown_box(String string) {
        BrowserUtils.wait(2);
        String actualName = inactivePage.currentTableStatus.getText();
        Assert.assertEquals(string, actualName);
        BrowserUtils.wait(2);

        loginPage.logout();
    }


}










