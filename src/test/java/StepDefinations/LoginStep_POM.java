//package StepDefinations;
//
//import static org.testng.Assert.assertEquals;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import Pages.LoginPage;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class LoginStep_POM {
//
//	WebDriver driver = null;
//	LoginPage login;
//	
//	@Given("Launch the chrome driver and Start the application")
//	public void launch_the_chrome_driver_and_start_the_application() {
//		
//		System.out.println("******inside loginStep_POM*******");
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path is "+ projectPath);
//	    System.setProperty("webdriver.chrome.driver", projectPath+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
//	    driver = new ChromeDriver();
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	    driver.manage().deleteAllCookies();
//	    driver.get("https://www.amazon.com/");
//	    driver.manage().window().maximize();
//	   
//	    driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
//	    
//	    System.out.println("inside step- Now user is on login page");
//	}
//
//	@When("User enter valid (.*) & (.*)")                                   
//	public void user_enter_valid_username_password(String username, String password) {
//		
//		
//		login = new LoginPage(driver);
//		
//		login.loginValidUser(username, password);
//	
//	//	driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(username);
//	//	driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
//	//	driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(password);
//		
//		System.out.println("inside step- user entered username & Password");
//	}
//
//	
//	@And("User should able to login successfully")
//	public void user_should_able_to_login_successfully() throws InterruptedException {
//		
//	//	driver.findElement(By.xpath("//*[@id = \"signInSubmit\"]")).click();
//		
//		System.out.println("inside step- user clicked on login button");
//		
//		Thread.sleep(2000);
//	}
//	
//	@Then("User is nevigated to home page")
//	public void user_nevigated_to_home_page() {
//		
//		String actualName = "Hello, Aarti";
//		String expectedName =  driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).getText();
//		
//		Assert.assertEquals(actualName, expectedName);
//	
//		System.out.println("inside step- user is on home page  "+ expectedName);
//		
//		WebElement D1 = driver.findElement(By.xpath("//*[@id=\"glow-ingress-line1\"]"));
//		if(D1.isDisplayed()){
//			
//			System.out.println("Displayed :" + D1.getText());
//			
//		}
//		
//		else {
//			System.out.println("not Displayed");
//		}
//		driver.close();
//	}
//	
//	
//}
