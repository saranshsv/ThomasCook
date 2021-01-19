package rough;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class RoughClass {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saran\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.thomascook.in/");
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		//Example of ImplicitWait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.id("holidayPlace")).sendKeys("Delhi");
		
		//Example of FluentWait
		/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.withMessage("Timed out after 30 seconds")
				.ignoring(Exception.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("holidayPlace"))).click();
		*/
		
		WebElement destination = driver.findElement(By.id("holidayPlace"));
		sendkeys(driver,destination,10,"Paris");
		
		driver.findElement(By.xpath("//div[@class='selectric']/p[contains(text(),'Budget')]")).click();
		WebElement budget = driver.findElement(By.xpath("//div[@class='selectric-items']/div/ul/li[@data-index=2]"));
		clickOn(driver,budget,10);
		
		driver.findElement(By.xpath("//div[@class='selectric']/p[contains(text(),'Month')]")).click();
	
		driver.findElement(By.xpath("//div[@class='selectric-items']/div/ul/ul/li[contains(text(),'Aug')]")).click();
		driver.findElement(By.xpath("//button[@id='search-button']")).click();
		driver.navigate().back();
		
	}

	public static void sendkeys(WebDriver driver, WebElement element, int timeout, String value) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

	public static void clickOn(WebDriver driver, WebElement element, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

}
