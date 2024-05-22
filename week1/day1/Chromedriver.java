package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class Chromedriver {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(2000);

		//Source
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[text()='Chennai']")).click(); 

		//Destination
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();

		//click on tom button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();

		String bus = driver.findElement(By.xpath("//h5[text()='Swamy Ayyappa Travels']")).getText();
		System.out.println("The First Resulting bus :" +bus);

		//Selecting bus type
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		//get the seat number
		String seatCount = driver.findElement(By.xpath("//small[text()='12']")).getText();
		System.out.println("Seat count"+seatCount);

		//click on show seats
		driver.findElement(By.xpath("//button[text()='Show Seats']")).click();

		//click on seat number
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='U7']")).click();
		// click on boarding point
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		//click on dropping point
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();

		//Selected seat and Total Fare
		String selectedSeat = driver.findElement(By.xpath("//span[text()='Seat Selected :']")).getText();
		String baseFare = driver.findElement(By.xpath("//span[text()='Base Fare :']")).getText();

		System.out.println("Seat Selected:"+selectedSeat+"\n"+"Total Fare:"+baseFare);

		String resultingPage = driver.getTitle();
		System.out.println("Resulting page :"+resultingPage);
		//close the browser
		driver.close();
	}


}
