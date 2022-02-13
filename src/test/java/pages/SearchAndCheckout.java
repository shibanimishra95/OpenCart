package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchAndCheckout {
	WebDriver driver;
	public void searchCart() throws InterruptedException
	{

		JavascriptExecutor jse	=(JavascriptExecutor) driver;
	WebElement element=driver.findElement(By.xpath("/html/body/header/div/div/div[3]/div/button"));
	element.click();
	Thread.sleep(2000);
		WebElement element1=driver.findElement(By.xpath("/html/body/div[2]/div[1]/a[2]"));
		element1.click();
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,400);");
		 Thread.sleep(2000);
		 WebElement element2=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div[2]/a"));
		 element2.click();
		 Thread.sleep(2000);
		 jse.executeScript("window.scrollBy(0,400);");
		 Thread.sleep(2000);
	}
	public SearchAndCheckout(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
}
