package selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;

public class Stranka_login {
		
	WebDriver driver;
	
	// FindBy vysvetleni: https://stackoverflow.com/questions/18436102/selenium-findby-vs-driver-findelement
    @FindBy(id = "inputEmail")   // patri k radku pod nim
    public WebElement field_email;
    @FindBy(how = How.NAME, using = "password")  //import org.openqa.selenium.support.How;
    private WebElement field_psw;
	By button_login = By.id("login");
	
    public Stranka_login (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);     
    }
    
    public void napis_email(String text) {
  //    driver.findElement(field_email).sendKeys(text);
         field_email.sendKeys(text);	
      
    }

    public void napis_psw(String text) {
    	    field_psw.sendKeys(text);
    	    }
    
    public void zmackni_login() {
    	  //   WebElement lokace = new Object();
    	      driver.findElement(button_login).click();
    	    }

}
