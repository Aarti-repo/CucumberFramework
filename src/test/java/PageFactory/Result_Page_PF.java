package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class Result_Page_PF {
	
	@FindBy(xpath = "//*[@id=\"glow-ingress-line1\"]")
	WebElement txt_d1;

	WebDriver driver;
	
	public Result_Page_PF(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void isDisplayed() {
		
		
		
	if(txt_d1.isDisplayed()){
			
			System.out.println("Displayed :" + txt_d1.getText());
			
		}
		
		else {
			System.out.println("not Displayed");
		}
	}

}
