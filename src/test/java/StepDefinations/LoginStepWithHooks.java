package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class LoginStepWithHooks {

	WebDriver driver = null;
	
  @Before(value ="@smoke", order =1)                                     // conditional hooks with tags annotation
	public void setup() {
		
         String ProjectPath = System.getProperty("user.dir");
     	System.out.println("Start of scenario");
		System.out.println("Project path is  :"+ ProjectPath);
		System.setProperty("webdriver.chrome.driver", ProjectPath+ "\\src\\test\\resources\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		}
	
 @After(value = "@smoke", order =0)                                            //hooks annotation
	public void teardown() {
		
		System.out.println("End of scenario");
		driver.close();
		driver.quit();	
 }
 
 
// @BeforeStep 

 @Before (order = 0)                                          // for ordering the sequence of execution
 public void beforeStep() {
	 
	 System.out.println("inside step");
 }
 
 
//@AfterStep
 
@After(value ="@smoke", order = 1)
     public void afterStep() {
	 
	    System.out.println("outside step");
 }
 

@Given("^Customer is on login page$")
public void customer_is_on_login_page() throws Throwable {
   
}

@When("^Customer enter valid username and password$")
public void customer_enter_valid_username_and_password() throws Throwable {
   
}

@When("^Customer Click on login button$")
public void customer_Click_on_login_button() throws Throwable {
    
}

@Then("^Customer will nevigate to the home page$")
public void customer_will_nevigate_to_the_home_page() throws Throwable {
   
}

@When("^Customer on login button$")
public void customer_on_login_button() throws Throwable {
   
}

}
