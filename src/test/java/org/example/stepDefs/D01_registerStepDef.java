package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
public class D01_registerStepDef {
    P01_register register = new P01_register();
    @Given("user go to register page")
    public void goRegisterPage()
    {
        register.registerLink.click();
    }
    @When("user select gender type")
    public void goGender()
    {
        register.genderMale.click();
    }
    @And("user enter first name {string} and last name {string}")
    public void goFirstLastName(String firstName, String lastName)
    {
        register.firstName.sendKeys(firstName);
        register.lastName.sendKeys(lastName);
    }
    @And("user enter date of birth")
    public void goDate() throws InterruptedException {
        Select selectDay = new Select(register.dateDay);
        selectDay.selectByValue("17");

        Select selectMonth = new Select(register.dateMonth);
        selectMonth.selectByValue("1");

        Select selectYear = new Select(register.dateYear);
        selectYear.selectByValue("1998");
    }
    @And("user enter email {string} field")
    public void goEmail(String email)
    {
        register.email.sendKeys(email);
    }
    @And("user fills Password fields {string} {string}")
    public void goPassword(String password, String confirmPassword)
    {
        register.password.sendKeys(password);
        register.confirmPassword.sendKeys(confirmPassword);
    }
    @And("user clicks on register button")
    public void goRegisterButton()
    {
        register.registerButton.click();
    }
    @Then("success message is displayed")
    public void goRegisterMessage()
    {
        String actualMessage = register.result.getText();
        String expectedMessage = "Your registration completed";
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(actualMessage, expectedMessage);
        String actualColor = Color.fromString("rgba(76, 177, 124, 1)").asHex();
        String expectedColor = Color.fromString(register.result.getCssValue("color")).asHex();
        soft.assertEquals(actualColor, expectedColor);
        soft.assertAll();
    }
}

