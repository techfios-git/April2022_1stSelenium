package launchBrowser;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Setup System Property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Apr22_Selenium\\1st_Selenium\\driver\\chromedriver.exe");
		//Object of Chrome driver
		WebDriver driver = new ChromeDriver();
		//got to a website
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		//pause execution
		Thread.sleep(5000);
		//close browser
		driver.close();
		
		
		
	}

}
