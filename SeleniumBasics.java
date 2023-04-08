package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println("The title of page is "+title);
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println("The current url is "+currentUrl);
		
		driver.close();

	}

}
