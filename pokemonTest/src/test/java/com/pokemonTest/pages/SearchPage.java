package com.pokemonTest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

    @FindBy(xpath = "//a[contains(.,'Advanced')]")
    public WebElement advanceTab;

    @FindBy(css = ".mw-search-results")
    public WebElement searchResult;

    @FindBy(xpath = "//p[@class='mw-search-nonefound']")
    public WebElement noFoundMessage;


}
