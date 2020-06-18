package stepDefinations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import pageObjects.LoginPage;
public class Step {

	public WebDriver driver; 
	public LoginPage lp;
	

@Given("user click on chrome browser")
	public void user_click_on_browser() {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user")+"//Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	lp=new LoginPage(driver);
	}

	
@When("user open url {string}")
	public void user_open_url(String url) {
	driver.get(url);
	}
	
@And("When user click on Signin")
	public void user_clcik_on_signin() {
	lp.clicksignin();
	}

@Then("user_entered_Email Address as{string} and Password as {string}")
	public void user_entered_emailid_and_password_as(String email, String password) throws InterruptedException {
	lp.setUsername(email);
	lp.setPassword(password);
	}
}

