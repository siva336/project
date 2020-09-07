package stepdefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.LoginPage;
import utils.TestaBase;

import java.awt.*;
import java.io.IOException;

public class Loginpagesteps extends TestaBase{




        LoginPage loginPage=new LoginPage();

        @Given("^Enter the url$")
        public void enter_the_url() throws IOException, AWTException {

            TestaBase.initialization();


        }
        @When("^Go to the required option$")
        public void go_to_the_required_option() throws Throwable {
            TestaBase.implicitwait();
            TestaBase.windowshandles();
            loginPage.clickOnDeveloperApplyButton();

            TestaBase.scroledown();
            loginPage.rApplyButton();


        }
        @And("^Validate the page$")
        public void validate_the_page() throws Throwable {

            TestaBase.scroledown();

            loginPage.ApplyButton();
            TestaBase.takeSnapShot();


    }
}
