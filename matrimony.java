package week5.day3;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class matrimony {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
				driver.get("https://www.tamilmatrimony.in/");
		
				driver.manage().window().maximize();
		
				WebElement forDD = driver.findElement(By.xpath("//select[@id='REGISTERED_BY']"));
				
				Select forDropDown = new Select(forDD);
				
				forDropDown.selectByVisibleText("Myself");		
		 
				driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("Haris");
		
				driver.findElement(By.xpath("//input[@id='gendermale']")).click();
		
				WebElement DateDD = driver.findElement(By.xpath("//select[@id='DOBDAY']"));
				
				Select DateDropDown = new Select(DateDD);
				
				DateDropDown.selectByIndex(12);
				
				Select month = new Select(driver.findElement(By.xpath("//select[@id='DOBMONTH']")));
				
				month.selectByVisibleText("Feb");
				
				Select year = new Select(driver.findElement(By.xpath("//select[@id='DOBYEAR']")));
				
				year.selectByVisibleText("2002");
			
				WebElement religionDD = driver.findElement(By.xpath("//select[@id='RELIGION']"));
				
				Select RelDropDown = new Select(religionDD);
				
				RelDropDown.selectByVisibleText("Muslim - Others");
		
				
				Select motherTongue = new Select(driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']")));
				
				motherTongue.selectByVisibleText("Tamil");
				
		
				Select country = new Select(driver.findElement(By.xpath("//select[@id='COUNTRY']")));
				
				country.selectByVisibleText("India");
				
		
				Select countryCode = new Select(driver.findElement(By.xpath("//select[@id='M_COUNTRYCODE']")));
				
				countryCode.selectByVisibleText("+91");
				
				driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("78787878855");
		
				driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("Harisahamed@gmail.com");
				
				driver.findElement(By.xpath("//input[@name='PASSWD1']")).sendKeys("Haris@5");
				
				System.out.println("Title of Page: " + driver.getTitle());
		
				driver.close();
	}
	
}

