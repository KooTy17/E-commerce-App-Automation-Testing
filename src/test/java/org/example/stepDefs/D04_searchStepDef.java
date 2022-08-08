package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
public class D04_searchStepDef {
    P03_homePage search = new P03_homePage();
    @When("user clicks on search")
    public void goSearchField()
    {
        search.searchField.click();
    }
    @And("user types product's name {string}")
    public void goType(String productName)
    {
        for (int i = 0; i<search.productName.size(); i++)
        {
            search.productName.get(i).sendKeys(productName);
        }
    }
    @And("user press on search button")
    public void goSearchButton()
    {
            search.searchButton.click();
    }
    @Then("user gets products results {string}")
    public void goSearchResult(String productName)
    {
        for (int i = 0; i<search.productName.size(); i++)
        {
            String actualUrl = Hooks.driver.getCurrentUrl();
            String expectedUrl = "https://demo.nopcommerce.com/search?q=";
            SoftAssert soft = new SoftAssert();
            soft.assertTrue(actualUrl.contains(expectedUrl));
            System.out.println("actual result : " + actualUrl);
            System.out.println("expected result : " + expectedUrl);
            soft.assertTrue(search.searchResult.get(i).getText().toLowerCase().contains(productName));
            System.out.println("actual result : " + search.searchResult.get(i).getText().toLowerCase());
            System.out.println("expected result : " + productName);
            soft.assertAll();
        }
    }
    @And("user types product's sku {string}")
    public void goTypeSku(String productSkuName)
    {
        for (int i = 0; i<search.productSkuName.size(); i++)
        {
            search.productSkuName.get(i).sendKeys(productSkuName);
        }
    }
    @Then("user gets products' sku results {string}")
    public void goSearchSkuResult(String productSkuName)
    {
        for (int i = 0; i<search.searchSkuResult.size(); i++)
        {
            search.searchSkuResultClick.click();
            Assert.assertTrue(search.verifySku.get(i).getText().contains(productSkuName));
            System.out.println("actual result : " + search.verifySku.get(i).getText());
            System.out.println("expected result : " + productSkuName);
        }
    }









}
