package com.pokemonTest.StepDefinitions;

import com.pokemonTest.pages.BasePage;
import com.pokemonTest.pages.ByNamePage;
import com.pokemonTest.pages.SearchPage;
import com.pokemonTest.utilities.BrowserUtils;
import com.pokemonTest.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class pokemonNames_StepDef {

    @When("Search {string} keywords in searchbox")
    public void search_keywords_in_searchbox(String string) {
        ByNamePage byNamePage=new ByNamePage();

        BrowserUtils.waitForVisibility(byNamePage.searchInbox,10);
        byNamePage.searchInbox.sendKeys("communities and events"+ Keys.ENTER);

        // byNamePage.searchInbox.sendKeys(Keys.ENTER);

    }

    @When("Click the advance tab")
    public void click_the_advance_tab() {
        new SearchPage().advanceTab.click();
    }

    @When("Click options checkbox")
    public void click_options_checkbox() throws InterruptedException {

        for (int i = 1; i <=2; i++) {

            WebElement table = Driver.get().findElement(By.xpath("(//input[@type='button'])["+i+"]"));
            table.click();
            Thread.sleep(2000);
            new ByNamePage().searchSubmitButton.click();

        }
        for (int i = 1; i <=15; i++) {

            WebElement table = Driver.get().findElement(By.xpath("//input[@name='ns"+i+"']"));
            table.click();
            Thread.sleep(2000);
            new ByNamePage().searchSubmitButton.click();

        }

            for (int i = 2; i <=9; i++) {

                WebElement table = Driver.get().findElement(By.xpath("//input[@name='ns10"+i+"']"));
                table.click();
                Thread.sleep(2000);
                new ByNamePage().searchSubmitButton.click();

            }
        for (int i = 4; i <=5; i++) {

            WebElement table = Driver.get().findElement(By.xpath("//input[@name='ns27"+i+"']"));
            table.click();
            Thread.sleep(2000);
            new ByNamePage().searchSubmitButton.click();

        }
        for (int i = 0; i <=3; i++) {

            WebElement table = Driver.get().findElement(By.xpath("//input[@name='ns230"+i+"']"));
            table.click();
          new BasePage().waitfor(2);
            new ByNamePage().searchSubmitButton.click();

        }
    }

    @Then("Verify to see the all related results")
    public void verify_to_see_the_all_related_results() {
        Assert.assertNotNull(new SearchPage().searchResult);
    }
}
