package com.pokemonTest.StepDefinitions;

import com.pokemonTest.pages.ByNamePage;
import com.pokemonTest.utilities.BrowserUtils;
import com.pokemonTest.utilities.ConfigurationReader;
import com.pokemonTest.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class searchFunction_StepDef {
    @Given("The user is on the Main Page")
    public void the_user_is_on_the_Main_Page() throws InterruptedException {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        Thread.sleep(2000);
        ByNamePage byNamePage=new ByNamePage();
        BrowserUtils.waitForVisibility(byNamePage.warningButton,10);
        byNamePage.warningButton.click();
    }

    @Given("Navigate to Bulbapedia tab and click By Name")
    public void navigate_to_Bulbapedia_tab_and_click_By_Name() throws InterruptedException {
       ByNamePage byNamePage=new ByNamePage();
        BrowserUtils.hover(byNamePage.BulbapediaTabs);
        Thread.sleep(2000);
        byNamePage.ByNameButton.click();
        Thread.sleep(2000);
    }

    @When("User click to Y letter in the content List")
    public void user_click_to_Y_letter_in_the_content_List() throws InterruptedException {
        new ByNamePage().YContex.click();
        Thread.sleep(2000);
    }

    @Then("Verify all the names start with Y Letter")
    public void verify_all_the_names_start_with_Y_Letter() {

        for (int i = 1; i <7; i++) {

            WebElement table = Driver.get().findElement(By.xpath("((//table[@class='roundy'])[25]//td[2])["+i+"]"));

            System.out.println(table.getText());

            Assert.assertTrue(table.getText().startsWith("Y"));



        }

    }

}
