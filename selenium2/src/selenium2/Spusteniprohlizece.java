package selenium2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import java.util.concurrent.TimeUnit;


public class Spusteniprohlizece {

	public static void main(String[] args) {
//	 System.out.println(System.getProperty("webdriver.chrome.driver"));	
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tomas Bilka\\Desktop\\selenium_podklady\\chromedriver_win32\\chromedriver.exe");
	 driver = createDriver();  	// slo by i bez prirazeni, protoze je to staticka var i staticka metoda
	 driver.get("http://www.google.com");//////////**//****
	 
	}
	
	public static WebDriver driver;
	
	public static WebDriver createDriver() {	
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	return driver; 
	}

	

}
