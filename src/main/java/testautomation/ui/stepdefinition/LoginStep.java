package testautomation.ui.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testautomation.ui.uibase.UI_Base;

public class LoginStep extends UI_Base {
    @Given("User is on the Cyclos LoginPage")
    public void userIsOnTheCyclosLoginPage() {


    }

    @When("User should login {string} and {string}")
    public void userShouldLoginAnd(String string, String string2) {


    }

    @Then("User should verify after Login success message {string}")
    public void userShouldVerifyAfterLoginSuccessMessage(String string) {


    }

   
    @When("User should login {string} and {string} with Enter key")
    public void userShouldLoginAndWithEnterKey(String string, String string2) {


    }

    @Then("User should verify after Login Error message {string}")
    public void userShouldVerifyAfterLoginErrorMessage(String string) {


    }

}
