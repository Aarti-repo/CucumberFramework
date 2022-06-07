package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF {

	
	@FindBy(xpath = "//*[@id=\"ap_email\"]")
	WebElement txt_Username;
	
	@FindBy(xpath ="//*[@id=\"continue\"]")
	WebElement btn_Continue;
	
	@FindBy(xpath = "//*[@id=\"ap_password\"]")
	WebElement txt_Password;
	
	@FindBy(xpath ="//*[@id = \"signInSubmit\"]")
	WebElement btn_Login;
	
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) {                  // constructor to get driver instance
		
		this.driver = driver;
		PageFactory.initElements(driver, this);         // u can use this keyword instead of "LoginPage_PF.class" to refer this current class
		
	//	PageFactory.initElements(new AjaxElementLocatorFactory(driver,30), this);  // it will wait for 30 sec until element specified by ananotation is loaded, 
		                                                                            //if element not found within given time it throw no such element exception
	}
	public void enter_Details(String username, String password)
	{
		
		txt_Username.sendKeys(username);
		btn_Continue.click();
		txt_Password.sendKeys(password);
	}
	
	public void validate_Login() {
		
		btn_Login.click();
		
	}
}
