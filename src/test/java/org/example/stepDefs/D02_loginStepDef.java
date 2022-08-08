package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;
public class D02_loginStepDef {
    P02_login login = new P02_login();
    @Given("user go to login page")
    public void goLoginPage() {
        login.loginLink.click();
    }
    @And("user login with \"valid\" {string} and {string}")
    public void goValidInformation(String validEmail, String validPassword) {
        login.validEmail.sendKeys(validEmail);
        login.validPassword.sendKeys(validPassword);
    }
    @And("user press on login button")
    public void goLoginButton() {
        login.loginButton.click();
    }
    @Then("user login to the system successfully")
    public void goValidMessage() {
        String actualLink = Hooks.driver.getCurrentUrl();
        String expectedLink = "https://demo.nopcommerce.com/";
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(actualLink, expectedLink);
        soft.assertTrue(login.validMessage.isDisplayed());
        soft.assertAll();
    }

    @And("user login with \"invalid\" {string} and {string}")
    public void goInvalidInformation(String invalidEmail, String invalidPassword) {
        login.invalidEmail.sendKeys(invalidEmail);
        login.invalidPassword.sendKeys(invalidPassword);
    }
    @Then("user could not login to the system")
    public void goInvalidMessage() {
        String actualMessage = login.invalidMessage.getText();
        String expectedMessage = "Login was unsuccessful.";
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(actualMessage.contains(expectedMessage));
        String actualColor = Color.fromString("rgba(228, 67, 75, 1)").asHex();
        String expectedColor = Color.fromString(login.invalidMessage.getCssValue("color")).asHex();
        soft.assertEquals(actualColor, expectedColor);
        soft.assertAll();
    }
}
