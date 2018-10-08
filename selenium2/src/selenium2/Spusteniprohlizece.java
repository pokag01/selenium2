package selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.junit.ComparisonFailure;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;  // kvuli assertum pri porovnavani v testech

public class Spusteniprohlizece {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
//	 System.out.println(System.getProperty("webdriver.chrome.driver"));	
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tomas Bilka\\Desktop\\selenium_podklady\\chromedriver_win32\\chromedriver.exe");
	 driver = createDriver();  	// slo by i bez prirazeni, protoze je to staticka var i staticka metoda
	 Spusteniprohlizece test01 = new Spusteniprohlizece();
	 test01.testLogin(driver);
	 
 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.quit();
	}
	
	public static WebDriver createDriver() {	
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	return driver; 
	}
	

	public void testLogin(WebDriver driver) {
		System.out.println(" zahajeni testu Loginu ");
		driver.get("https://phptravels.org/clientarea.php");
		Stranka_login stranka = new Stranka_login(driver);
		stranka.napis_email("pokag01");
		stranka.napis_psw("heslo123");
		stranka.zmackni_login();
		try{
//		assertEquals("Login",stranka.pageTitle_Login.getText());  
		assertEquals("Login This page is restricted",stranka.pageTitle_Login.getText()); 
		System.out.println("Test was succesfull");
		} 
		catch (ComparisonFailure chyba){
		//Exception in thread "main" org.junit.ComparisonFailure: expected:<Login[]> but was:<Login[ This page is restricted]>
			System.out.println(chyba);
			System.out.println(" test zfailoval X X X X X  ");
		}
		
		//	return driver;
	}

}
