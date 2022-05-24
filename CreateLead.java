import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver = new ChromeDriver();
	
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	
	
	
	WebElement eleUserName = driver.findElement(By.id("username"));
	
	eleUserName.sendKeys("DemoSalesManager");
	
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sumitha");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Venkat");
	
	WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select select = new Select(eleSource);
	select.selectByVisibleText("Conference");
	
	
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sumi1");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Welcome to led page");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nmsumitha@gmail.com");
	
	driver.findElement(By.name("submitButton")).click();
	//Thread.sleep(2000);
	//String firstName = driver.findElement(By.id("viewLead_firstName_sp")).
	
	//driver.findElement(By.name("company Name")).sendKeys("TestLeaf");
	
	
	
	
	//createLeadForm_generalStateProvinceGeoId
	}

}
