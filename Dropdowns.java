package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

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
		
		WebElement dropdown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select d1 = new Select(dropdown1);
		d1.selectByVisibleText("Partner");
		
		WebElement dropdown2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select d2 = new Select(dropdown2);
		d2.selectByValue("CATRQ_AUTOMOBILE");
		
		WebElement dropdown3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select d3 = new Select(dropdown3);
		d3.selectByIndex(3);
		
		WebElement dropdown4 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		dropdown4.sendKeys("Public Corporation");
		
		
		
		driver.findElement(By.name("submitButton")).click();

	}

}
