package com.gmail.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SamplePage {

	 WebDriver driver;

	    @FindBy(id="search")
	    WebElement searchTextBox;
	   
	    @FindBy(name="searchBtn")
	    WebElement searchButton;

	    //Constructor
	    public SamplePage(WebDriver driver){
	        this.driver = driver;
	        //initElements method to initialize all elements
	        PageFactory.initElements(driver, this);
	    }
	    
	    //Sample method
	    public void search(String searchTerm){
	        searchTextBox.sendKeys(searchTerm);  
	        searchButton.click();
	    }
}
