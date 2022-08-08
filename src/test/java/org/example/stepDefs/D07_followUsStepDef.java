package org.example.stepDefs;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.junit.Assert;

import java.util.ArrayList;

public class D07_followUsStepDef {

    P03_homePage follow = new P03_homePage();
    @When("user opens facebook link")
    public void goClickFacebookLink()
    {
        follow.clickFacebookLink.click();
    }
    @Then("{string} Facebook is opened in new tab")
    public void goFacebookOpen(String facebook) throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        facebook = "https://www.facebook.com/nopCommerce";
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),facebook);
    }
    @When("user opens twitter link")
    public void goClickTwitterLink()
    {
        follow.clickTwitterLink.click();
    }
    @Then("{string} Twitter is opened in new tab")
    public void goTwitterOpen(String twitter) throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        twitter = "https://twitter.com/nopCommerce";
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), twitter);

    }
    @When("user opens rss link")
    public void goClickRssLink()
    {
        follow.clickRssLink.click();
    }
    @Then("{string} Rss is opened in new tab")
    public void goRssOpen(String rss) throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        rss = "https://demo.nopcommerce.com/new-online-store-is-open";
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), rss);

    }
    @When("user opens youtube link")
    public void goClickYouTuberLink()
    {
        follow.clickYouTubeLink.click();
    }
    @Then("{string} YouTube is opened in new tab")
    public void goYouTubeOpen(String youTube) throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        youTube = "https://www.youtube.com/user/nopCommerce";
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), youTube);

    }
}
