package selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;

public class Stranka_login {
	
	WebDriver driver;
//	private WebElement q;
	By field_email = By.name("username");
	By field_psw = By.name("password");
	By button_login = By.id("login");
	
    public Stranka_login (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this.driver);        
    }
    
    public void napis_email(String text) {
  //   WebElement lokace = new Object();
      driver.findElement(field_email).sendKeys(text);
    }

    public void napis_psw(String text) {
    	  //   WebElement lokace = new Object();
    	      driver.findElement(field_psw).sendKeys(text);
    	    }
    
    public void zmackni_login() {
    	  //   WebElement lokace = new Object();
    	      driver.findElement(button_login).click();
    	    }

}
