package org.computerdb.pages;

import org.computerdb.base.parentpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class deletecomputername extends parentpage 
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
	
	//Xpath of Delete Computer
	@FindBy(xpath="//input[@class='btn danger']")
	WebElement DelComputer;
	
	//Capturing Message of Deleted Computer
	@FindBy(xpath="//*[@id='main']/div[1]")
	WebElement DeleteComputerName;
		
	//Initializing PageFactory Elements
	public deletecomputername() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String DeleteSearchComputerName(String ComputerName) throws InterruptedException 
	{
		//Input Computer Name
		Searchbox.sendKeys(ComputerName);
		FilterSubmit.click();
		Thread.sleep(3000);
		
		//Click on the Searched Text Link
		WebElement ComputerNameLink = driver.findElement(By.linkText(ComputerName));
		ComputerNameLink.click();
		
		Thread.sleep(3000);
		
		//Delete Computer Name
		DelComputer.click();
		
		Thread.sleep(3000);		
				
		return DeleteComputerName.getText(); 
		
	}

}
