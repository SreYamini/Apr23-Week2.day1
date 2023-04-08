package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
	
		
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
			companyName.sendKeys("Infosys");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sre Yamini");
			WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
			lastName.sendKeys("I");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Yams");
			driver.findElement(By.name("departmentName")).sendKeys("CSE");
			driver.findElement(By.name("description")).sendKeys("Computer Science");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
			WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select state =  new Select(dropdown);
			state.selectByVisibleText("New York");
			driver.findElement(By.name("submitButton")).click();
			String title = driver.getTitle();
			System.out.println("The title of webpage "+title);
			
			driver.findElement(By.linkText("Duplicate Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).clear();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infy");
			
			driver.findElement(By.id("createLeadForm_firstName")).clear();
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yamini");
			
			driver.findElement(By.name("submitButton")).click();
			
			String duplicateTitle = driver.getTitle();
			System.out.println("The title of webpage "+duplicateTitle);
			
			
			

	}

}
