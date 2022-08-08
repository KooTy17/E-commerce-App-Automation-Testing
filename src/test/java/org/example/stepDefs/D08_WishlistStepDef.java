package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.junit.Assert;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

import java.awt.*;

public class D08_WishlistStepDef {
    P03_homePage wishList = new P03_homePage();
    @When("user add {string} to wishlist")
    public void goWishListLoveButton(String product) throws InterruptedException {
        wishList.clickWishListLoveButton.click();

    }
    @Then("user could see success message")
    public void goWishListSuccessMessage() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(wishList.wishlistSuccessMessage.isDisplayed(), " true");
        String actualColor = Color.fromString("rgba(75, 176, 122, 1)").asHex();
        String expectedColor = Color.fromString(wishList.wishlistSuccessMessage.getCssValue("background-color")).asHex();
        soft.assertEquals(actualColor, expectedColor);
        soft.assertAll();
        Thread.sleep(5000);
    }
    @And("user clicks on wishlist button")
    public void goWishListButton()
    {
        wishList.clickWishListButton.click();
    }
    @Then("user could see wishlisted products")
    public void goWishListQuantity()
    {
        int actualQuantity = Integer.parseInt(wishList.wishListQuantity.getAttribute("value"));
        Assert.assertTrue(actualQuantity > 0);
    }


}
