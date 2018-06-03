package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchpo extends library1.BasePage{

	public Searchpo(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//a[text()='Facebook - Log In or Sign Up']")
	private WebElement facebookLink;
	public WebElement facebookLink() {
		return facebookLink;
	}
	@FindBy(xpath="//a[text()='Instagram']")
	private WebElement instagramLink;
	public WebElement instagramLink() {
		return instagramLink;
	}
	@FindBy(xpath="//a[text()='Login on Twitter']")
	private WebElement twitterLink;
	public WebElement twitterLink() {
		return twitterLink;
	}
	@FindBy(xpath="//a[text()='Signup']")
	private WebElement linkedinLink;
	public WebElement linkedinLink() {
		return linkedinLink;
}
}
