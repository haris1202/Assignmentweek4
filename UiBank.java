package week5.day3;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiBank {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://uibank.uipath.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[@class='btn btn-white btn-xl get-started-button']")).click();
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Haris");
		
		WebElement findElement = driver.findElement(By.xpath("//select[@id='title']"));
		
		Select Title=new Select(findElement);
		
		Title.selectByVisibleText("Mr");
		
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("MJ");
		
		WebElement findElement2 = driver.findElement(By.xpath("//select[@name='gender']"));
		
		Select Gender=new Select(findElement2);
		
		Gender.selectByVisibleText("Male");
		
		WebElement findElement3 = driver.findElement(By.xpath("//select[@name='employmentStatus']"));
		
		Select Employee=new Select(findElement3);
	
		Employee.selectByVisibleText("Full-time");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Haris");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("harishamed@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Haris@2");
		
		System.out.println("Title of Page: " + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.close();
		
		
		
		
		
	}

}
