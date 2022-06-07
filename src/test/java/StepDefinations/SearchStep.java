package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.*;
import junit.framework.Assert;

public class SearchStep {

	WebDriver driver = null;
	
	@Given("^Open the Browser$")
	public void open_the_Browser() throws Throwable {
		
		String ProjectPath = System.getProperty("user.dir");
		
		System.out.println("Project path is  :"+ ProjectPath);
		System.setProperty("webdriver.chrome.driver", ProjectPath+ "\\src\\test\\resources\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	}

	@And("^nevigate to google page$")
	public void nevigate_to_google_page() throws Throwable {
		
		driver.navigate().to("Https://www.google.com");
		Thread.sleep(2000);
	  
	}

	@When("^user enters text in search box$")
	public void user_enters_text_in_search_box() throws Throwable {
	    
		driver.findElement(By.name("q")).sendKeys("Amazon");
	}

	@And("^hits Enter$")
	public void hits_Enter() throws Throwable {
	   
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("^user will nevigate to the serch result page$")
	public void user_will_nevigate_to_the_serch_result_page() throws Throwable {
	  
		String ExpectedTitle = "Amazon - Google Search";
		String ActualTitle = driver.getTitle();
		
	//	Assert.assertEquals(ActualTitle, ExpectedTitle, "not equal");                   // if not equal, return given assert error msg & halted the execution.
		Assert.assertEquals(ActualTitle, ExpectedTitle);                                // if not equal, return default assert error & halted the execution.
		System.out.println("Result page Title :"+ ActualTitle);
		
		Thread.sleep(2000);
		
		driver.getPageSource().contains("Amazon.in");                          // returns true if contains same sequence & continue execution otherwise false
		
		driver.findElement(By.xpath("//h3[contains(text(),'Amazon.in')]")).click();
		
		driver.close();

	}

}
