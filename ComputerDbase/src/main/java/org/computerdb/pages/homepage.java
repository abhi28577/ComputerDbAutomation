package org.computerdb.pages;

import org.computerdb.base.parentpage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homepage extends parentpage
{
	//Xpath of Searchbox Element
	@FindBy(xpath="//input[@id='searchbox']")
	WebElement Searchbox;
	
	//Xpath of Search Submit
	@FindBy(xpath="//input[@id='searchsubmit']")
	WebElement FilterSubmit;
	
	//Xpath of Add New Computer Button
	@FindBy(xpath="//a[@id='add']")
	WebElement AddComputer;
	
	//Xpath of Heading Section
	@FindBy(xpath="//*[@id=\"main\"]/h1")
	WebElement HeadSection;
	
	//Xpath of Computer Name Field
	@FindBy(xpath="//a[contains(text(),'Computer name')]")
	WebElement ComputerNameField;
	
	//Xpath of Introduced Field
	@FindBy(xpath="//a[contains(text(),'Introduced')]")
	WebElement IntroducedField;
	
	//Xpath of Discontinued Field
	@FindBy(xpath="//a[contains(text(),'Discontinued')]")
	WebElement DiscontinuedField;
	
	//Xpath of Company Field
	@FindBy(xpath="//a[contains(text(),'Company')]")
	WebElement CompanyField;
	
	//Xpath of Previous Link
	@FindBy(xpath="//a[contains(text(),'Previous')]")
	WebElement PreviousLink;
	
	//Xpath of Next Link
	@FindBy(xpath="//a[contains(text(),'Next')]")
	WebElement NextLink;
	
	//Xpath of Page Display
	@FindBy(xpath="//li[@class = 'current']")
	WebElement PageDisplay;
	
	//Initializing PageFactory Elements
	public homepage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	//Check Searchbox is Enabled/Editable
	public boolean CheckSearchTextEnabled()
	{
		boolean SearchEnabled = Searchbox.isEnabled();		
		return SearchEnabled;		
	}
	
	//Check Filter By Name is Enabled
	public boolean CheckFilterButtonEnabled() 
	{
		boolean FilterEnabled=FilterSubmit.isEnabled();
		return FilterEnabled;
	}
	
	//Check Add Computer Name Button is Enabled
	public boolean AddComputerButtonEnabled() 
	{
		boolean AddEnabled=AddComputer.isEnabled();
		return AddEnabled;
	}
	
	//Check SubHeading Title
	public String Subheading()
	{
		String SubheadTitle = HeadSection.getText();
		//String SubStringHeadTitle = SubheadTitle.replaceAll("\\D+", ""); // Replaces all Non-Digits with Spaces
		String SubStringHeadTitle = SubheadTitle.replaceAll("\\d", "");
		SubStringHeadTitle = SubStringHeadTitle.replaceFirst("\\s", "");
		return SubStringHeadTitle;
	}
	
	//Verify Computer Name Field Exists
	public boolean ComputerNameField()
	{
		boolean ComputernameField = ComputerNameField.isDisplayed(); 
		return ComputernameField;
	}
	
	//Verify Introduced Field Exists
	public boolean IntroducedField()
	{
		boolean Introducedfield = IntroducedField.isDisplayed(); 
		return Introducedfield;
	}
	
	//Verify Discontinued Field Exists
	public boolean DiscontinuedField()
	{
		boolean Discontinuedfield = DiscontinuedField.isDisplayed(); 
		return Discontinuedfield;
	}
	
	//Verify Company Field Exists
	public boolean CompanyField()
	{
		boolean Companyfield = CompanyField.isDisplayed(); 
		return Companyfield;
	}
	
	//Verify Previous Link Exists
	public boolean PreviousLink()
	{
		boolean Previouslink = PreviousLink.isDisplayed(); 
		return Previouslink;
	}
	
	//Verify Next Link Exists
	public boolean NextLink()
	{
		boolean Nextlink = NextLink.isDisplayed(); 
		return Nextlink;
	}
	
	//Verify Previous Link Exists
	public boolean PageDisplay()
	{
		boolean Pagedisplay = PageDisplay.isDisplayed(); 
		return Pagedisplay;
	}
	
	//Navigate to Add Computer Name Page
	public addcomputerpage AddComputerNameNavigate()
	{
		AddComputer.click();
		
		//Wait Time after each transaction
		WebDriverWait wait = new WebDriverWait(driver,2);
		
		return new addcomputerpage();
	}

	
}
