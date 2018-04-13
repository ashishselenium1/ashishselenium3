import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CNN {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://cnn.com");
		String text =driver.findElement(By.xpath("//*[@id='intl_homepage1-zone-1']/div[2]/div/div[1]/ul/li[1]/article/a/h2")).getText();
		System.out.println(text);
	}

}
