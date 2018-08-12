package org.computerdb.testset;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.computerdb.base.parentpage;
import org.computerdb.pages.deletecomputername;
import org.computerdb.pages.homepage;
import org.computerdb.util.testutil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class deletecomputernametest extends parentpage
{
	homepage HomePage;
	deletecomputername DeleteComputerName;
	
	String SheetName = "SearchData";
	
	public deletecomputernametest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() 
	{
		initialization();
		HomePage = new homepage();
		DeleteComputerName = new deletecomputername();		
	}
	
	@DataProvider
	public Object[][] SearchComputerName()
	{
		Object data[][] = testutil.getTestData(SheetName);
		return data;		
	}
	
	@Test(priority=1, dataProvider="SearchComputerName")
	public void ValidateDeleteComputer(String ComputerName) throws InterruptedException
	{ 
		 
		String Subheadtitle = DeleteComputerName.DeleteSearchComputerName(ComputerName);
		Assert.assertEquals(Subheadtitle, "Done! Computer has been deleted");				
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
