package selenium2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class AbstractPage {
	
	@FindBy(className = "navbar-toggle")
	public WebElement button_menu; 

}
