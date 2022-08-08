package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class D06_homeSlidersStepDef {
    P03_homePage slider = new P03_homePage();
    @When("user clicks on first slider button")
    public void goClickFirstSliderButton()
    {
        slider.clickFirstSliderButton.click();
    }
    @And("user clicks on first product")
    public void goClickFirstProduct()
    {
        slider.clickFirstProduct.click();
    }
    @Then("user go to first product page")
    public void goFirstSliderResult()
    {
        String actualFirstProductSlider = Hooks.driver.getCurrentUrl();
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String expectedFirstProductSlider = "https://demo.nopcommerce.com/nokia-lumia-1020";
        Assert.assertEquals(actualFirstProductSlider, expectedFirstProductSlider);
    }
    @When("user clicks on second slider button")
    public void goClickSecondSliderButton()
    {
        slider.clickSecondSliderButton.click();
    }
    @And("user clicks on second product")
    public void goClickSecondProduct()
    {
        slider.clickSecondProduct.click();
    }
    @Then("user go to second product page")
    public void goSecondSliderResult()
    {
        String actualSecondProductSlider = Hooks.driver.getCurrentUrl();
        Hooks.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        String expectedSecondProductSlider = "https://demo.nopcommerce.com/iphone-6";
        Assert.assertEquals(actualSecondProductSlider, expectedSecondProductSlider);
    }
}
