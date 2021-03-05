package com.pokemonTest.pages;

import com.pokemonTest.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {

        PageFactory.initElements(Driver.get(), this);
    }





    public void waitfor(int seconds){
        try {
            Thread.sleep(seconds*1000);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
