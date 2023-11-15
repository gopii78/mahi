package empirehome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class staff {
	
	public static void main(String[] args) throws Throwable {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://empirehome.myprojectsonline.co.in/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sureshbabuemp@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ZPMHQHIA");
		driver.findElement(By.xpath("//button [@class='btn green_btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='treeview'][3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Add New Staff'] ")).click();
		driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("gopii");
		driver.findElement(By.xpath("//input[@name='EmailId']")).sendKeys("gopimahesh@gmail.com");
		driver.findElement(By.xpath("//input[@name='MobileNumber']")).sendKeys("8764435456");
		driver.findElement(By.xpath("//button[text()=' Save']")).click();
		}

}
