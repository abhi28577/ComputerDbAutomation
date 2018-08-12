package org.computerdb.testset;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import org.testng.Assert;
import org.computerdb.base.parentpage;
import org.computerdb.pages.addcomputerpage;
import org.computerdb.pages.homepage;
import org.computerdb.util.testutil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class addcomputerpagetest extends parentpage
{	
	homepage HomePage;
	addcomputerpage AddComputerPage;
	
	String SheetName1 = "NegativeData";
	String SheetName2 = "PositiveData";
		
	public addcomputerpagetest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp() 
	{
		initialization();
		HomePage = new homepage();
		AddComputerPage = new addcomputerpage();		
	}
	
	@Test(priority=1) 
	public void ValidateComputerNameText() throws InterruptedException
	{
		boolean ComputerNametext = AddComputerPage.ComputerNameText();
		Assert.assertEquals(ComputerNametext, true);
		Thread.sleep(3000);
	}
	
	@Test(priority=2)
	public void ValidateIntroducedText() throws InterruptedException
	{
		boolean Introducedtext = AddComputerPage.IntroducedText();
		Assert.assertEquals(Introducedtext, true);
		Thread.sleep(3000);
	}
	
	@Test(priority=3)
	public void ValidateDiscontinuedText() throws InterruptedException
	{
		boolean Discontinuedtext = AddComputerPage.DiscontinuedText();
		Assert.assertEquals(Discontinuedtext, true);
		Thread.sleep(3000);
	}
	
	@Test(priority=4)
	public void ValidateCompanyDropDown() throws InterruptedException
	{
		boolean CompanyDropdown = AddComputerPage.CompanySelect();
		Assert.assertEquals(CompanyDropdown, true);
		Thread.sleep(3000);
	}
	
	@Test(priority=5)
	public void ValidateCreateComputerButt() throws InterruptedException
	{
		boolean CreateComputerbutt = AddComputerPage.CreateComputer();
		Assert.assertEquals(CreateComputerbutt, true);
		Thread.sleep(3000);
	}
	
	@Test(priority=6)
	public void ValidateCancelButt() throws InterruptedException
	{
		boolean Cancelbutt = AddComputerPage.CancelComputer();
		Assert.assertEquals(Cancelbutt, true);
		Thread.sleep(3000);
	}
	
	@Test(priority=7)
	public void ValidateSubHeadTitle() throws InterruptedException
	{
		String Subheadtitle = AddComputerPage.SubHeadTitle();
		Assert.assertEquals(Subheadtitle, "Add a computer");
		Thread.sleep(3000);
	}
	
	@Test(priority=8)
	public void ValidateRequiredCaptionText() throws InterruptedException
	{
		String Requiredcaption = AddComputerPage.RequiredCaption();
		Assert.assertEquals(Requiredcaption, "Required");
		Thread.sleep(3000);
	}
	
	@Test(priority=9)
	public void ValidateIntroducedDateCaption() throws InterruptedException
	{
		String IntroducedDatecaption = AddComputerPage.IntroducedDateCaption();
		Assert.assertEquals(IntroducedDatecaption, "Date ('yyyy-MM-dd')");
		Thread.sleep(3000);
	}
	
	@Test(priority=10)
	public void ValidateDiscontinuedDateCaption() throws InterruptedException
	{
		String DiscontinuedDatecaption = AddComputerPage.DiscontinuedDateCaption();
		Assert.assertEquals(DiscontinuedDatecaption, "Date ('yyyy-MM-dd')");
		Thread.sleep(3000);
	}
	
	@DataProvider
	public Object[][] CreateComputerNegativeTestData()
	{
		Object data[][] = testutil.getTestData(SheetName1);
		return data;		
	}
	
	@Test(priority=11, dataProvider="CreateComputerNegativeTestData")
	public void ValidateCreateComputerNegativeData(String ComputerName, String IntroducedDate, String DiscontinuedDate, String CompanyName) throws InterruptedException
	{ 		 
		String Subheadtitle = AddComputerPage.CreateNewComputerData(ComputerName, IntroducedDate, DiscontinuedDate, CompanyName);			
		Assert.assertEquals(Subheadtitle, "Add a computer");
		Thread.sleep(3000);
	}
	
	@DataProvider
	public Object[][] CreateComputerPositiveTestData()
	{
		Object data[][] = testutil.getTestData(SheetName2);
		return data;		
	}
	
	@Test(priority=12, dataProvider="CreateComputerPositiveTestData")
	public void ValidateCreateComputerPositiveData(String ComputerName, String IntroducedDate, String DiscontinuedDate, String CompanyName) throws InterruptedException
	{ 
		 
		String Subheadtitle = AddComputerPage.CreateNewComputerData(ComputerName, IntroducedDate, DiscontinuedDate, CompanyName);
				
					
		String SubStringHeadTitle = Subheadtitle.replaceAll("\\d", "");
		Subheadtitle = SubStringHeadTitle.replaceFirst("\\s", "");
				
		System.out.println("New Computer Name Added:" + AddComputerPage.CreateNewComputerNameText());
		Assert.assertEquals(Subheadtitle, "computers found");				
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
