package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.*;

public class StepsForBackground {

	WebDriver driver = null;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    
		  String ProjectPath = System.getProperty("user.dir");
	     	System.out.println("Start of scenario");
			System.out.println("Project path is  :"+ ProjectPath);
			System.setProperty("webdriver.chrome.driver", ProjectPath+ "\\src\\test\\resources\\Drivers\\chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}

	@When("^user enters username & password$")
	public void user_enters_username_password() throws Throwable {
		
		try {
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");                   //handling exception try : code which thorws or raise exceptio
		}
		
		catch(NoSuchElementException e) {
		 
		
		System.out.println("Login is failed");	 
	    	}
	}

	@And("^click on login button$")
	public void click_on_login_button() throws Throwable {
	    
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^user is nevigated to home page$")
	public void user_is_nevigated_to_home_page() throws Throwable {
		
		String ActualTitle = "OrangeHRM";
		String expectedTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, expectedTitle, "Equal");
	    System.out.println("user is on home page");
	}


//	@Given("^user is logged in$")
//	public void user_is_logged_in() throws Throwable {
//
//	}

	@When("^user click on welcome link$")
	public void user_click_on_welcome_link() throws Throwable {

		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		
	}

	@Then("^logout link is displayed$")
	public void logout_link_is_displayed() throws Throwable {
             
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).isDisplayed();
		System.out.println("logout link is displayed");
		driver.close();
	}

	@When("^user clicks on dashboard link$")
	public void user_clicks_on_dashboard_link() throws Throwable {
		
		driver.findElement(By.id("menu_dashboard_index")).click();
		
	}

	@Then("^quick launch toobar is displayed$")
	public void quick_launch_toobar_is_displayed() throws Throwable {

		driver.findElement(By.id("dashboard-quick-launch-panel-menu_holder")).isDisplayed();
		System.out.println("quick launch is visible");
		driver.close();
	}

}
