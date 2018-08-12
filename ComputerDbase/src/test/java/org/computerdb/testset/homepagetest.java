package org.computerdb.testset;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.computerdb.base.parentpage;
import org.computerdb.pages.addcomputerpage;
import org.computerdb.pages.homepage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class homepagetest extends parentpage 
{
	homepage HomePage;
	addcomputerpage AddComputerPage;
	
	public homepagetest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		HomePage = new homepage();
		AddComputerPage = new addcomputerpage();
	}
	
	@Test(priority=1)
	public void ValidateSearchbox() throws InterruptedException 
	{
		boolean Searchbool = HomePage.CheckSearchTextEnabled();
		Assert.assertEquals(Searchbool,true);
		Thread.sleep(3000);
		
	}
	
	@Test(priority=2)
	public void ValidateFilterButton() throws InterruptedException
	{
		boolean Filterbool = HomePage.CheckFilterButtonEnabled();
		Assert.assertEquals(Filterbool, true);
		Thread.sleep(3000);
	}
	
	@Test(priority=3) 
	public void ValidateAddComputerButton() throws InterruptedException
	{
		boolean AddComputerbool = HomePage.AddComputerButtonEnabled();
		Assert.assertEquals(AddComputerbool, true);
		Thread.sleep(3000);
	}
	
	@Test(priority=4)
	public void ValidateSubheadTitle() throws InterruptedException
	{
		String SubheadTitle=HomePage.Subheading();
		Assert.assertEquals(SubheadTitle,"computers found");
		Thread.sleep(3000);
	}
	
	@Test(priority=5)
	public void ValidateComputerNameField() throws InterruptedException
	{
		boolean ComputerNamebool = HomePage.ComputerNameField();
		Assert.assertEquals(ComputerNamebool, true);
		Thread.sleep(3000);
	}
	
	@Test(priority=6)
	public void ValidateIntroducedField() throws InterruptedException
	{
		boolean Introducedbool = HomePage.IntroducedField();
		Assert.assertEquals(Introducedbool, true);
		Thread.sleep(3000);
	}
	
	@Test(priority=7)
	public void ValidateDiscontinuedField() throws InterruptedException
	{
		boolean Discontinuedbool = HomePage.DiscontinuedField();
		Assert.assertEquals(Discontinuedbool, true);
		Thread.sleep(3000);
	}
	
	@Test(priority=8)
	public void ValidateCompanyField() throws InterruptedException
	{
		boolean Companybool = HomePage.CompanyField();
		Assert.assertEquals(Companybool, true);
		Thread.sleep(3000);
	}
	
	@Test(priority=9)
	public void ValidatePreviousLink() throws InterruptedException
	{
		boolean PreviousLinkbool = HomePage.PreviousLink();
		Assert.assertEquals(PreviousLinkbool, true);
		Thread.sleep(3000);
	}
	
	@Test(priority=10)
	public void ValidateNextLink() throws InterruptedException
	{
		boolean NextLinkbool = HomePage.NextLink();
		Assert.assertEquals(NextLinkbool, true);
		Thread.sleep(3000);
	}
	
	@Test(priority=11)
	public void ValidatePageDisplay() throws InterruptedException
	{
		boolean PageDisplaybool = HomePage.PageDisplay();
		Assert.assertEquals(PageDisplaybool, true);
		Thread.sleep(3000);
	}
	
	@Test(priority=12)
	public void ValidateAddNewComputerPage() throws InterruptedException
	{
		Assert.assertEquals(AddComputerPage.SubHeadTitle(), "Add a computer");
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
