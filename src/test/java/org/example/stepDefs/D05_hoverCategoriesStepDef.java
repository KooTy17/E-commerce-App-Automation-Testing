package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class D05_hoverCategoriesStepDef {
    public static int selectedMainCategory;
    public static List<WebElement> mainCategories;
    public static int selectedSubCategory;
    public static List<WebElement> subCategories;
    P03_homePage hover = new P03_homePage();
    @When("user hover categories")
    public void goHoverMainCategory()
    {
        Actions action = new Actions(Hooks.driver);
        mainCategories = hover.hoverCategory;
        System.out.println(mainCategories);
        int countCategories = mainCategories.size();//7
        System.out.println("There is " + countCategories + " categories.");
        int minCountCategories = 0;
        int maxCountCategories = countCategories-1;
        selectedMainCategory =  (int)Math.floor(Math.random()*(maxCountCategories-minCountCategories+1)+minCountCategories);
        action.moveToElement(mainCategories.get(selectedMainCategory)).perform();
        String selectedMainCategoryName = mainCategories.get(selectedMainCategory).getText().toLowerCase().trim();
        System.out.println("The selected category is : " + selectedMainCategoryName);
    }
    @Then("user hover and select sub categories")
    public void goHoverSubCategory()
    {
        String locator = "(//ul[@class='top-menu notmobile']//ul)[" +Integer.toString(selectedMainCategory+1)+"]/li";
        System.out.println(locator);
        subCategories = Hooks.driver.findElements(By.xpath(locator));
        Hooks.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        if(!subCategories.isEmpty()) {
            int countSubCategories = subCategories.size();
            System.out.println("There is " + countSubCategories + " sub-categories.");
            int minCountSubCategories = 0;
            int maxCountSubCategories = countSubCategories - 1;
            selectedSubCategory = (int) Math.floor(Math.random() * (maxCountSubCategories - minCountSubCategories + 1) + minCountSubCategories);
            String selectedSubCategoryName = subCategories.get(selectedSubCategory).getText().toLowerCase().trim();
            System.out.println("The selected category is : " + selectedSubCategoryName);
            subCategories.get(selectedSubCategory).click();
            String subCategoryTitle = hover.hoverResult.getText().toLowerCase().trim();
            Assert.assertTrue(subCategoryTitle.contains(selectedSubCategoryName.toLowerCase().trim()));
        }
        else
        {
            mainCategories.get(selectedMainCategory).click();
            String selectedMainCategoryName = mainCategories.get(selectedMainCategory).getText().toLowerCase().trim();
            String categoryTitle = hover.hoverResult.getText().toLowerCase().trim();
            Assert.assertTrue(categoryTitle.contains(selectedMainCategoryName.toLowerCase().trim()));
        }
    }
}
