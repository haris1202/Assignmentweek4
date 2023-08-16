package week5.day3;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
					ChromeDriver driver = new ChromeDriver();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
					driver.get("https://www.facebook.com/");
					driver.manage().window().maximize();
					driver.findElement(By.xpath("//a[text()='Create new account']")).click();
					driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Haris");
					driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ahamed");
					driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7867867860");
					driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Haris@Haris");
					//Date of birth day
					WebElement findElement = driver.findElement(By.xpath("//select[@name='birthday_day']"));
					//findElement
					Select Dateofbirth=new Select(findElement);
					//selectValue
					Dateofbirth.selectByValue("2");
					//Date of month
					driver.findElement(By.xpath("//select[@name='birthday_month']"));
					//dropDown
				    Select Dropdown=new Select(findElement);
				    //visibleText
				    Dropdown.selectByVisibleText("12");	    
				    //Date of year
				    WebElement findElement2 = driver.findElement(By.xpath("//select[@id='year']"));
				    //Date of year
				    Select Dateofyear=new Select(findElement2);
				    //selectValue
				    Dateofyear.selectByValue("2002");
				     //radio Button
				    driver.findElement(By.xpath("//input[@name='sex']")).click();
					


}
}

		
	  
	    