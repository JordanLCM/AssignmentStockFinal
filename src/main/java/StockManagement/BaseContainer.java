package StockManagement;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseContainer {

	public static WebDriver Driver;

	@BeforeClass
	@Parameters({ "Browser" })
	public void Chrome(String Browser) {
//		DesiredCapabilities Capab = new DesiredCapabilities();
//		Capab.setBrowserName("firefox");
//		URL url = null;
//		try {
//			url = new URL("http://192.168.1.117:4444/wd/hub");
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
//		System.setProperty("webdriver.chrome.driver",
//				"/home/jordanliucmcraf/eclipse-workspace/Simplilearn-Assignment/Drivers/chromedriver");
//		System.setProperty("webdriver.gecko.driver",
//				"/home/jordanliucmcraf/eclipse-workspace/Simplilearn-Assignment/Drivers/geckodriver");
		System.out.println("Parameter value = " + Browser);
		if (Browser.equalsIgnoreCase("chrome")) {
			Driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("firefox")) {
			Driver = new FirefoxDriver();
		}
		Driver.manage().window().maximize();
	}
}
