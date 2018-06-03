package testscript;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


import library1.BaseTest;
import pomclass.Googlepo;
import pomclass.Searchpo;

public class Test1 extends BaseTest{
	public WebDriverWait wait;
	@Test
	public void testFacebookHome() {
	
		wait=new WebDriverWait(driver, 20);
		driver.get("https://www.google.com/");
		Googlepo googlePO=new Googlepo(driver);
		googlePO.searchTxtBx().sendKeys("facebook"+Keys.ENTER);
		Searchpo searchPO=new Searchpo(driver);
		searchPO.verifyElement(searchPO.facebookLink());
		searchPO.facebookLink().click();
		System.out.println(driver.getTitle());
		String eTitle = "Facebook – log in or sign up";
		//wait.until(ExpectedConditions.titleContains(eTitle));
		String aTitle = driver.getTitle();
		Reporter.log("Title is displayed"+aTitle, true);
		//searchPO.verifyTitle(eTitle);
		Assert.assertEquals(aTitle, eTitle);
	}
		

}

