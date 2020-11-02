package com.library.step_definitions;

import com.library.pages.LoginPage;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
    LoginPage loginPage= new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Thread.sleep(3000);

    }

    @When("user logs in as a librarian")
    public void user_logs_in_as_a_librarian() throws InterruptedException {
        Thread.sleep(3000);
        loginPage.login();

    }
    @Then("user should be able to see dashboard page")
    public void user_should_be_able_to_see_dashboard_page() {

        String actualTitle=Driver.getDriver().getTitle();


        Assert.assertTrue("Verification Failed",actualTitle.equalsIgnoreCase("Library"));
        //Driver.getDriver().close();


    }

}
