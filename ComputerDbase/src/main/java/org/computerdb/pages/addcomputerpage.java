package org.computerdb.pages;

import org.computerdb.base.parentpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class addcomputerpage extends parentpage 
{
	
	//Initializing Locators
	
	//Xpath of Add New Computer Button
	@FindBy(xpath="//a[@id='add']")
	WebElement AddComputer;
	
	//Initializing Computer Name Textbox
	@FindBy(xpath="//input[@id='name']")
	WebElement CompNameText;
	
	//Initializing Introduced Date Textbox
	@FindBy(xpath="//input[@id='introduced']")
	WebElement IntroducedText;
	
	//Initializing Discontinued Date Textbox
	@FindBy(xpath="//input[@id='discontinued']")
	WebElement DiscontinuedText;
	
	//Initializing Company Selection
	@FindBy(xpath="//select[@name='company']")
	WebElement CompanySelect;
	
	//Initializing Create Computer Button
	@FindBy(xpath="//input[@class='btn primary']")
	WebElement CreateComputerButt;
	
	//Initializing Cancel Button
	@FindBy(xpath="//a[@class='btn']")
	WebElement CancelButt;
	
	//Capturing SubHeading Title
	@FindBy(xpath="//*[@id=\"main\"]/h1")
	WebElement SubheadTitle;
	
	//Capturing Message of Newly Added Computer
	@FindBy(xpath="//*[@id='main']/div[1]")
	WebElement NewComputerNameText;			

	//Capturing Required Text
	@FindBy(xpath="//span[@class = 'help-inline']//preceding-sibling::input[@id='name']//parent::div[@class='input']")
	WebElement RequiredCaption;
	
	//capturing Date next to Introduced Date Textbox
	@FindBy(xpath="//span[@class = 'help-inline']//preceding-sibling::input[@id='introduced']//parent::div[@class='input']")
	WebElement IntroducedDateCaption;
		
	//capturing Date next to Discontinued Date Textbox
	@FindBy(xpath="//span[@class = 'help-inline']//preceding-sibling::input[@id='discontinued']//parent::div[@class='input']")
	WebElement DiscontinuedDateCaption;
	
	
	public addcomputerpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Verify Computer Name Text box is Enabled
	public boolean ComputerNameText()
	{
		//Click on Add a new Computer on Home Page to Navigate to Creation of Computer Page
		AddComputer.click();
		
		//Wait Time after each transaction
		WebDriverWait wait = new WebDriverWait(driver,2);
		
		boolean Computernametext = CompNameText.isEnabled(); 
		return Computernametext;
	}
	
	//Verify Introduced Text box is Enabled
	public boolean IntroducedText()
	{
		//Click on Add a new Computer on Home Page to Navigate to Creation of Computer Page
		AddComputer.click();
		
		//Wait Time after each transaction
		WebDriverWait wait = new WebDriverWait(driver,2);
		
		boolean Introducedtext = IntroducedText.isEnabled();
		return Introducedtext;
	}
	
	//Verify Discontinued Text box is Enabled
	public boolean DiscontinuedText()
	{
		//Click on Add a new Computer on Home Page to Navigate to Creation of Computer Page
		AddComputer.click();
		
		//Wait Time after each transaction
		WebDriverWait wait = new WebDriverWait(driver,2);
		
		boolean Discontinuedtext = DiscontinuedText.isEnabled();
		return Discontinuedtext;
	}
	
	//Verify Company Drop-Down List is Enabled
	public boolean CompanySelect()
	{
		//Click on Add a new Computer on Home Page to Navigate to Creation of Computer Page
		AddComputer.click();
		
		//Wait Time after each transaction
		WebDriverWait wait = new WebDriverWait(driver,2);
		
		boolean Companyselect = CompanySelect.isEnabled();
		return Companyselect;
	}
	
	//Verify Create Computer Button is Enabled
	public boolean CreateComputer()
	{
		//Click on Add a new Computer on Home Page to Navigate to Creation of Computer Page
		AddComputer.click();
		
		//Wait Time after each transaction
		WebDriverWait wait = new WebDriverWait(driver,2);
		
		boolean CreateComputerbutt = CreateComputerButt.isEnabled();
		return CreateComputerbutt;
	}
	
	//Verify Cancel Button is Enabled
	public boolean CancelComputer()
	{
		//Click on Add a new Computer on Home Page to Navigate to Creation of Computer Page
		AddComputer.click();
		
		//Wait Time after each transaction
		WebDriverWait wait = new WebDriverWait(driver,2);
		
		boolean Cancelbutt = CancelButt.isEnabled();
		return Cancelbutt;
	}
	
	//Verify SubHeading Title Exists
	public String SubHeadTitle()
	{
		//Click on Add a new Computer on Home Page to Navigate to Creation of Computer Page
		AddComputer.click();
		
		//Wait Time after each transaction
		WebDriverWait wait = new WebDriverWait(driver,2);
		
		String Subheadtitle = SubheadTitle.getText();
		return Subheadtitle;
	}
	
	//Verify New Computer Name Creation Exists
	public String CreateNewComputerNameText()
	{			
		//Wait Time after each transaction
		WebDriverWait wait = new WebDriverWait(driver,2);
			
		String NewComputerName =NewComputerNameText.getText(); 
		return NewComputerName;
	}
	
	//Verify Required Caption Exists
	public String RequiredCaption()
	{
		//Click on Add a new Computer on Home Page to Navigate to Creation of Computer Page
		AddComputer.click();
		
		//Wait Time after each transaction
		WebDriverWait wait = new WebDriverWait(driver,2);
		
		String Requiredcaption = RequiredCaption.getText();
		return Requiredcaption;
	}
	
	//Verify Introduced Date Caption Exists
	public String IntroducedDateCaption()
	{
		//Click on Add a new Computer on Home Page to Navigate to Creation of Computer Page
		AddComputer.click();
		
		//Wait Time after each transaction
		WebDriverWait wait = new WebDriverWait(driver,2);
		
		String IntroducedDatecaption = IntroducedDateCaption.getText();
		return IntroducedDatecaption;
	}
	
	//Verify Discontinued Caption Exists
	public String DiscontinuedDateCaption()
	{
		//Click on Add a new Computer on Home Page to Navigate to Creation of Computer Page
		AddComputer.click();
		
		//Wait Time after each transaction
		WebDriverWait wait = new WebDriverWait(driver,2);
		
		String DiscontinuedDatecaption = DiscontinuedDateCaption.getText();
		return DiscontinuedDatecaption;
	}
	
	//Submit for Creation of New Computer without keying any value in any of Textbox
	public String CreateNewComputerData(String ComputerName, String IntroducedDate, String DiscontinuedDate, String CompanyName)
	{
		//Click on Add a new Computer on Home Page to Navigate to Creation of Computer Page
		AddComputer.click();
						
		//Computer Name
		CompNameText.sendKeys(ComputerName);
		
		//Introduced Date
		IntroducedText.sendKeys(IntroducedDate);
		
		//Discontinued Date
		DiscontinuedText.sendKeys(DiscontinuedDate);
		
		//Select Company Name from Drop-Down
		Select company = new Select(CompanySelect);		
		company.selectByVisibleText(CompanyName);
		
		//Click on Create Computer Button
		CreateComputerButt.submit();
		
		//Wait Time after each transaction
		WebDriverWait wait = new WebDriverWait(driver,2);
		
		/*if (SubheadTitle.getText()!="Add a computer")
		{
			//Capturing Message of Newly Added Computer
			WebElement Subheadtext = driver.findElement(By.xpath("//div[contains(text(),'Done! " + ComputerName + " has been created)]"));
			System.out.println("Computer Name has been successfully added:" + Subheadtext.getText());
		}*/
		
		return SubheadTitle.getText();		
	}
	
}
