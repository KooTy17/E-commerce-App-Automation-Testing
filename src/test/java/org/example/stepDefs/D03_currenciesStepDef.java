package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class D03_currenciesStepDef {
    P03_homePage currency = new P03_homePage();
    @When("user press the dropdown list on the top left of home page")
    public void goCurrencyList()
    {
        currency.currencyList.click();
    }
    @And("user select euro currency")
    public void goSelectCurrency()
    {
        currency.selectCurrency.click();
    }
    @Then("user could see products in euro currency")
    public void goProductCurrency()
    {

        for (int i = 0; i<currency.productsCurrency.size(); i++)
        {
            List<WebElement> products = currency.productsCurrency;
            String actualProductCurrency = products.get(i).getText();
            String expectedProductCurrency = "€";
            Assert.assertTrue(actualProductCurrency.contains(expectedProductCurrency));
            System.out.println("Actual currency : " + actualProductCurrency );
            System.out.println("Expected currency : " + expectedProductCurrency );
        }
    }
}
