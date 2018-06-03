package pomclass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library1.BasePage;

public class Googlepo  extends BasePage{

	public Googlepo(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(name="q")
	private WebElement searchTxtBx1;
	public WebElement searchTxtBx() {
		return searchTxtBx1;
		
	}
	
		
}