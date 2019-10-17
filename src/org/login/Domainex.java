package org.login;


	
	
	


	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

public class Domainex {


	
		 public static  void main(String[] args) throws AWTException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Gomathi S\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.eurowings.com/en.html");
			driver.manage().window().maximize();
			JavascriptExecutor jk=(JavascriptExecutor)driver;
			
			
			WebElement flight = driver.findElement(By.xpath("//span[text()=' Flights ']"));
			jk.executeScript("arguments[0].scrollIntoView(true)",flight);
			WebElement Departure = driver.findElement(By.id("gid-autocomplete-1-input"));
			Robot r =new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Departure.sendKeys("London");
			Departure.click();
			


	//jk.executeScript("arguments[0].setAttribute('value','greens')",Departure);
	WebElement Destination =driver.findElement(By.id("gid-autocomplete-2-input"));
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Destination.sendKeys("Hamburg");

		WebDriverWait  w=new WebDriverWait(driver,100);
		WebElement ele = w.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Outgoing flight']")));
		ele.click();
	//WebElement OutgoingFlight =driver.findElement(By.xpath("//input[@placeholder='Outgoing flight']"));
	//JavascriptExecutor jk1=(JavascriptExecutor)driver;
	//jk1.executeScript("arguments[0].click()",OutgoingFlight);

	//OutgoingFlight.click();
		
	WebElement date = driver.findElement(By.xpath("//input[@class='a-input-text__input m-form-mask__input-field a-input-text__input--deco-icon'][1]"));
	date.sendKeys("24/10/19");

	WebElement Search = driver.findElement(By.id("gid-mask-1-input"));
	Search.sendKeys("24/10/20");
	Search.click();

	//WebElement Outgoing =driver.findElement(By.id("form-radiobutton-1124-0"));
	//Outgoing.click();
	WebElement searchflight =driver.findElement(By.xpath("//span[@class='a-cta__container'][97]"));
	searchflight.click();
	WebElement changesearch =driver.findElement(By.xpath("//span[@class='a-cta__text'][4]"));
	changesearch.click();
	WebElement datechange =driver.findElement(By.id("gid-mask-1-input"));
	datechange.sendKeys("20/10/20");
	WebElement adults= driver.findElement(By.xpath("//span[@class='a-cta__icon']"));
	Actions acc = new Actions(driver);
	acc.doubleClick(adults);
	acc.doubleClick(adults).perform();

	WebElement flightfor = driver.findElement(By.xpath("//span[@class='t-block']"));
	flightfor.click();
	WebElement Basic  = driver.findElement(By.xpath("//button[@class='m-ibe-flighttariff__select']"));
	Basic.click();
		}

	}


