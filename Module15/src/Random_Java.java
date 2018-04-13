import java.util.Random;

import org.openqa.selenium.chrome.ChromeDriver;


public class Random_Java {

	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt());
		System.out.println(r.nextInt());
		System.out.println(r.nextInt());
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(100));//0-99
		System.out.println(r.nextInt(1000));//0-999

	}

}
