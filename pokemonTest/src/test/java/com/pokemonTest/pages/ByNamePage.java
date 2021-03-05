package com.pokemonTest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ByNamePage extends BasePage{
    @FindBy(xpath = "(//table[@class='roundy'])[25]")
    public WebElement TableY;

    @FindBy(xpath = "(//a[@href='#Y'])[1]")
    public WebElement YContex;

    @FindBy(xpath = "//input[@class='bg-global-nav-search-input']")
    public WebElement searchInbox;

    @FindBy(xpath = "(//a[@class='banner_continueBtn--3KNKl'])[2]")
    public WebElement warningButton;


    @FindBy(xpath = "(//span[contains(.,'Search')])[3]")
    public WebElement searchSubmitButton;

    @FindBy(xpath = "(//a[contains(.,'Bulbapedia')])[1]")
    public WebElement BulbapediaTabs;

    @FindBy(xpath = "//a[contains(.,'By Name')]")
    public WebElement ByNameButton;

}
