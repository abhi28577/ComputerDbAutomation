package org.computerdb.testset;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.computerdb.base.parentpage;
import org.computerdb.pages.searchcomputer;
import org.computerdb.util.testutil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class searchcomputertest extends parentpage
{	
	searchcomputer SearchComputer;
	
	String SheetName = "SearchData";
	
	public searchcomputertest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() 
	{
		initialization();	
		SearchComputer = new searchcomputer();		
	}
	
	@DataProvider
	public Object[][] SearchComputerName()
	{
		Object data[][] = testutil.getTestData(SheetName);
		return data;		
	}
	
	@Test(priority=1, dataProvider="SearchComputerName")
	public void ValidateSearchComputer(String ComputerName) throws InterruptedException
	{ 
		 
		String Subheadtitle = SearchComputer.SearchComputerName(ComputerName);
		Thread.sleep(3000);
		Assert.assertEquals(Subheadtitle, "One computer found");		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
