package pageObjects;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class LoginPage {
	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);

	}
	
// click on signin
	@FindBy(how=How.XPATH, using="//a[@id='header_sign_in']")
	private WebElement signin;	
	 
 
	
// Enter Userid
	@FindBy(how=How.XPATH, using="//[@id='logonId']") 
	private WebElement userid;


//Enter Password
	@FindBy(how=How.XPATH, using="//[@id='logonPassword']")
	private WebElement password;

	public void clicksignin() {
		signin.click();
	}
	
	public void setUsername(String Uname) {
		userid.sendKeys(Uname);
	}
	
	public void setPassword(String pwd) throws InterruptedException {
		password.sendKeys(pwd);
		Thread.sleep(3000);
	}
	
}
	
	
	
	
	
	
	
	