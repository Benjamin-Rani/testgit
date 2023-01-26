package helloselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	
	

	public static void main(String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TU\\eclipse-workspace\\Hello-world\\src\\test\\resources\\drivers\\chromedriver.exe");
 WebDriver chromedriver = new ChromeDriver();

 chromedriver.get("https://amazon.com");
	
	
	
	}
}