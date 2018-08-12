package org.computerdb.pages;

import org.computerdb.base.parentpage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchcomputer extends parentpage 
{
	//Initializing Locators
	
	//Xpath of Searchbox Element
	@FindBy(xpath="//input[@id='searchbox']")
	WebElement Searchbox;
		
	//Xpath of Search Submit
	@FindBy(xpath="//input[@id='searchsubmit']")
	WebElement FilterSubmit;
	
	//Xpath of Heading Section
	@FindBy(xpath="//*[@id=\"main\"]/h1")
	WebElement HeadSection;
	
	
	//Initializing PageFactory Elements
	public searchcomputer() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String SearchComputerName(String ComputerName) 
	{
		//Input Computer Name
		Searchbox.sendKeys(ComputerName);
		FilterSubmit.click();
		
		String SubHeadTitle = HeadSection.getText();		
		//String SubStringHeadTitle = SubHeadTitle.replaceAll("\\d", "");
		//SubHeadTitle = SubStringHeadTitle.replaceFirst("\\s", "");
				
		return SubHeadTitle; 
		
	}

}
