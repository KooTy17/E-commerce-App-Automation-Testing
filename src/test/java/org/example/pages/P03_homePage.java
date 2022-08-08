package org.example.pages;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class P03_homePage {
    //D03_currenciesStepDef
    public P03_homePage()
    {
        PageFactory.initElements(Hooks.driver, this);
    }
    //D03_currenciesStepDef
    @FindBy(name = "customerCurrency")
    public WebElement currencyList;
    @FindBy(xpath = "//option[@value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]")
    public WebElement selectCurrency;
    @FindBy(xpath = "//span[@class=\"price actual-price\"]")
    public List<WebElement> productsCurrency;
    //D04_searchStepDef
    @FindBy(className = "search-box-text")
    public WebElement searchField;
    @FindBy(className = "search-box-text")
    public List<WebElement> productName;
    @FindBy(className = "button-1")
    public WebElement searchButton;
    @FindBy(className = "product-item")
    public List<WebElement> searchResult;
    @FindBy(className = "search-box-text")
    public List<WebElement> productSkuName;
    @FindBy(className = "product-item")
    public List<WebElement> searchSkuResult;
    @FindBy(className = "product-item")
    public WebElement searchSkuResultClick;
    @FindBy(className = "sku")
    public List<WebElement> verifySku;
    //D05_hoverCategoriesStepDef
    @FindBy(xpath = "//ul[@class=\"top-menu notmobile\"]/li")
    public List<WebElement> hoverCategory;
    @FindBy(xpath = "//ul[@class=\"top-menu notmobile\"]")
    public List<WebElement> hoverSubCategory;
    @FindBy(xpath = "//div[@class=\"page-title\"]/h1")
    public WebElement hoverResult;
    //D06_homeSlidersStepDef
    @FindBy(xpath = "//a[@rel=\"0\"]")
    public WebElement clickFirstSliderButton;
    @FindBy(xpath = "//a[@rel=\"0\"]")
    public WebElement clickFirstProduct;
    @FindBy(xpath = "//div[class=\"nivoSlider\"]/a[1]")
    public WebElement firstSliderResult;
    @FindBy(xpath = "//a[@rel=\"1\"]")
    public WebElement clickSecondSliderButton;
    @FindBy(xpath = "//a[@rel=\"1\"]")
    public WebElement clickSecondProduct;
    @FindBy(xpath = "//div[class=\"nivoSlider\"]/a[2]")
    public WebElement secondSliderResult;
    //D07_followUsStepDef
    @FindBy(xpath = "//a[@href=\"http://www.facebook.com/nopCommerce\"]")
    public WebElement clickFacebookLink;
    @FindBy(xpath = "//a[@href=\"https://twitter.com/nopCommerce\"]")
    public WebElement clickTwitterLink;
    @FindBy(xpath = "//a[@href=\"rss\"]")
    public WebElement clickRssLink;
    @FindBy(xpath = "//a[@href=\"http://www.youtube.com/user/nopCommerce\"]")
    public WebElement clickYouTubeLink;
    //D08_WishlistStepDef
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]")
    public WebElement clickWishListLoveButton;
    @FindBy(xpath = "//div[@class=\"bar-notification success\"]")
    public WebElement wishlistSuccessMessage;
    @FindBy(xpath = "//a[@class=\"ico-wishlist\"]")
    public WebElement clickWishListButton;
    @FindBy(xpath = "//input[@value=\"1\"]")
    public WebElement wishListQuantity;
























  /* public WebElement hoverSubCategory()
   {
       return Hooks.driver.findElement(By.cssSelector("ul[class=\"sublist first-level\"]"));
   }


    @FindBy(xpath = "//ul[@class=\"sublist first-level\"]/li")
    public WebElement selectSubCategory;

*/


    /*
    public WebElement currencyList()
    {
        return Hooks.driver.findElement(By.name("customerCurrency"));
    }
    public WebElement selectCurrency()
    {
        return Hooks.driver.findElement(By.cssSelector("option[value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]"));
    }
    /*
    public WebElement productsCurrency()
    {
        return Hooks.driver.findElement(By.cssSelector("span[class=\"price actual-price\"]"));
    }
     */
    //D04_searchStepDef
    /*
    public WebElement searchField()
    {
        return Hooks.driver.findElement(By.className("search-box-text"));
    }
    public WebElement productName()
    {
        return Hooks.driver.findElement(By.className("search-box-text"));
    }
    public WebElement searchButton()
    {
        return Hooks.driver.findElement(By.className("button-1"));
    }
    public WebElement searchResult()
    {
        return Hooks.driver.findElement(By.className("product-item"));
    }
    public WebElement productSku()
    {
        return Hooks.driver.findElement(By.className("search-box-text"));
    }
    public WebElement searchSkuResult()
    {
        return Hooks.driver.findElement(By.className("product-item"));
    }
    //D05_hoverCategoriesStepDef
    public WebElement hoverCategory()
    {
        return Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]"));
    }
    public WebElement hoverSubCategory()
    {
        return Hooks.driver.findElement(By.cssSelector("ul[class=\"sublist first-level\"]"));
    }
    public WebElement selectSubCategory()
    {
        return Hooks.driver.findElement(By.cssSelector("ul[class=\"sublist first-level\"]"));
    }
    /*public WebElement hoverResult()
    {

    }


     */










}
