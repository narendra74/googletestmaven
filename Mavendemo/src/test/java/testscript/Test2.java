package testscript;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library1.BaseTest;
import pomclass.Googlepo;
import pomclass.Searchpo;

public class Test2 extends BaseTest{
	public WebDriverWait wait;
	@Test
	public void testInstagramHome() {
	
		wait=new WebDriverWait(driver, 20);
		driver.get("https://www.google.com/");
		Googlepo googlePO=new Googlepo(driver);
		googlePO.searchTxtBx().sendKeys("instagram"+Keys.ENTER);
		Searchpo searchPO=new Searchpo(driver);
		searchPO.verifyElement(searchPO.instagramLink());
		searchPO.instagramLink().click();
		System.out.println(driver.getTitle());
		String eTitle = "Instagram ";
		wait.until(ExpectedConditions.titleContains(eTitle));
		String aTitle = driver.getTitle();
		Reporter.log("Title is displayed"+aTitle, true);
		//searchPO.verifyTitle(eTitle);
		Assert.assertEquals(aTitle, eTitle);
	}
}
		


