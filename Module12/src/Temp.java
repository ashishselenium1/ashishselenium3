import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Temp {

	public static void main(String[] args) {
	//	WebDriver fd = new FirefoxDriver();
	//	WebDriver cd = new ChromeDriver();
	//	WebDriver ed = new EdgeDriver();
		
		WebDriver driver = null;
		driver = new FirefoxDriver();
		driver.get("http://yahoo.com");
		driver = new ChromeDriver();
		driver.get("http://yahoo.com");
		driver = new EdgeDriver();
		driver.get("http://yahoo.com");
	}

}
