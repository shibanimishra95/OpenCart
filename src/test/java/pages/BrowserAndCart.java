package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BrowserAndCart {
WebDriver driver;

public void actionBtn() throws InterruptedException
{
	JavascriptExecutor jse	=(JavascriptExecutor) driver;
WebElement element =driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[1]/a"));
WebElement element1=driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[1]/div/div/ul/li[2]/a"));

 Actions actions=new Actions(driver);
 actions.moveToElement(element);

 actions.moveToElement(element1);
 
 actions.click().build().perform();
// jse.executeScript("arguments[0].click();",element2);
 Thread.sleep(2000);
 jse.executeScript("window.scrollBy(0,360);");
 //Thread.sleep(4000);
 //jse.executeScript("window.scrollBy(0,scrollHeight);");
 Thread.sleep(2000);
 WebElement element2=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[2]/div[2]/button[1]/span"));
 element2.click();
 
}
public BrowserAndCart(WebDriver driver) {
	super();
	this.driver = driver;
}
}
