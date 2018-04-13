
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FB_FindFriend {

	public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
        /*
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myprofile = profile.getProfile("Test_Prof");
		myprofile.setPreference("dom.webnotifications.enabled", false);
		FirefoxOptions options = new FirefoxOptions().setProfile(myprofile);
		WebDriver driver = new FirefoxDriver(options);
		*/
		ChromeOptions ops = new ChromeOptions();
	    ops.addArguments("--disable-notifications");
	    WebDriver driver = new ChromeDriver(ops);
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("its.thakur@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("aasshhiisshh");
		driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.findElement(By.xpath("//div[@class='linkWrap noCount']")).click();
		driver.findElement(By.xpath("//a[@data-tab-key='friends']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for your friends']")).sendKeys("shandilya");
		
		
	}

}
