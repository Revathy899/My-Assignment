package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class amazon {


	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Bags for b");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='bags for b']")).click();
		String totalResults = driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small')]//span")).getText();

		System.out.println("total number of results :"+totalResults);
		driver.findElement(By.xpath("//li[@id='p_89/Skybags']/span[1]/a[1]/div[1]/label[1]/i[1]")).click();
		driver.findElement(By.xpath("//span[contains(@class,'a-button a-button-dropdown')]")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		String bagDetails = driver.findElement(By.xpath("(//div[contains(@class,'a-section a-spacing-small')])[3]")).getText();
		System.out.println("Bag information :"+bagDetails);
		String title = driver.getTitle();
		System.out.println("Current Page Title :"+title);
		driver.close();

	}
}
