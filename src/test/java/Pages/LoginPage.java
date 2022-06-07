package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By txt_username = By.xpath("//*[@id=\"ap_email\"]");
	By btn_continue = By.xpath("//*[@id=\"continue\"]");
	By txt_password = By.xpath("//*[@id=\"ap_password\"]");
	By btn_login = By.xpath("//*[@id = \"signInSubmit\"]");
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void loginValidUser(String username, String password)
	{
		
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(btn_continue).click();
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
	}
}
